package com.engeto.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> Mylist = new ArrayList<>();
        final int LIMIT=5;

        System.out.println("Sum of numbers is: "+readIntsFromInputAndPrintItUntilNegative()); //1.

        System.out.println("Sum of numbers is: "+sumAllInputUntilNegative()); //2.

        Mylist = storeAllInputInArrayListUntilNegative(); //3.
        System.out.println ("The numbers entered are: ");
        printList(Mylist);

        System.out.println("Sum all integers from list is: "+sumAllIntegersFromList(Mylist));//4.
        System.out.println();

        printIntegersUnderLimit(Mylist,LIMIT);

        printIntegersWithReplace(Mylist);



    }

    // nebylo v zadání:
    public static void printList(List<Integer> list){
        for (int number : list) {
            System.out.println(number);
        }
        System.out.println();
    }


    // Toto jsem si nakopíroval z hotového řešení, jinak bych to dohromady nedal
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }


    //     --- zadání č. 1.:
//    @@ -31,13 +31,15 @@ public static void readIntsFromInputAndPrintItUntilNegative() {
//         * @return Sum of input numbers expect of terminating negative number.
//         --------------------------------- vypracování:
    public static int readIntsFromInputAndPrintItUntilNegative() {
        ArrayList<Integer> listIntegers = new ArrayList<>();
        System.out.println("Enter the integers: ");
        int input = 1;
        while (input >= 0) {
            input = Support.safeReadInt();
            if (input>=0) listIntegers.add(input);
        }
        int sum = 0;
        for (int number : listIntegers) {
            System.out.println(number);
            sum +=number;
        }
        return sum;
    }


//    --- zadání č.2.:
//    public static int sumAllInputUntilNegative() {
//        return 0;
//    }  --------------------------------- vypracování:
    public static int sumAllInputUntilNegative() {
        System.out.println("Enter next integers: ");
        int input = 1;
        int sum = 0;
        while (input >= 0) {
            input = Support.safeReadInt();
            if (input>=0) sum +=input;
        }
        return sum;
    }


    /** --- zadání č.3.
     * Store all input numbers in a list (negative number terminates reading).
     * @return List of read values (terminating negative value is NOT included)

    public static List storeAllInputInArrayListUntilNegative() {
        return null;
    }
    */
    public static ArrayList storeAllInputInArrayListUntilNegative() {
        ArrayList<Integer> listIntegers = new ArrayList<>();
        System.out.println("Enter next integers for the list: ");
        int input = 1;
        while (input >= 0) {
            input = Support.safeReadInt();
            if (input>=0) listIntegers.add(input);
        }
        return listIntegers;
    }


    /** --- zadání č.4.
     @@ -48,8 +50,11 @@ public static void printAllIntegersFromList(List<Integer> list) {
     }

     public static Integer sumAllIntegersFromList(List<Integer> list) {
     return null;
     }*/

     public static Integer sumAllIntegersFromList(List<Integer> list) {
         int sum=0;
         for (int number:list) {
             sum +=number;
         }
     return sum;
     }

     //endregion---?
      //region Conditions---?


     /**  --- zadání č.5.
      * Print integers from given list that are smaller than given limit.
      * @param limit Limit - only smaller integers are printed
     @@ -64,6 +69,7 @@ public static void printIntegersUnderLimit(List<Integer> list, int limit) {
     */

     public static void printIntegersUnderLimit(List<Integer> list, int limit) {
         System.out.print("Limit is number "+limit+". The numbers are smaller than the limit: ");
         for (int number:list) {
             if (number<limit) System.out.print(number+", ");
         }
         System.out.println();
         System.out.println();
     }


   /* --- zadání č.6
    public static void printIntegersWithReplace(List<Integer> list) {
    }*/

    public static void printIntegersWithReplace(List<Integer> list) {
        System.out.println("In our list, these numbers: ");
        printList(list);
        int myIndex = -1;
        System.out.print("Write number you want tu change: ");

        while (myIndex==-1) {
            int numberChange = Support.safeReadInt();
            myIndex = list.lastIndexOf(numberChange);
            if (myIndex == -1) {
                System.out.print("The number is not in the list. Write number you want tu change from the list: ");
            }
        }
        System.out.print("Write the new number: ");
        int numberNew = Support.safeReadInt();
        list.set(myIndex,numberNew);
        System.out.println();
        System.out.println("New list with new number: ");
        printList(list);
    }

}
