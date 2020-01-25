package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements should the array have?");
        int numbersInArray = input.nextInt();
        int[] MyArr = new int[numbersInArray];
        for (int i = 0; i < numbersInArray; i++) {
            System.out.println("Declare element located at index position " + i + "\r");
            MyArr[i] = input.nextInt();
        }
        //printArray(MyArr);
        resizeArray(MyArr);

       // smallestNumber(MyArr);
        //largestNumber(MyArr);
       // sortArray(MyArr);
       //reverseArray(MyArr);
        // averageValueNumbersArray (MyArr);
        //sortArrayDescendingOrder(MyArr);
        // arrayReverseSorting2(MyArr);
    }

    // resize array by doubling the elements
    public static int [] resizeArray (int [] MyArr) {

        int [] resizedArray = new int [MyArr.length *2];

        for (int i = 0; i < MyArr.length ; i++){
           resizedArray [i] = MyArr[i];
        }
        for (int i = 0; i < resizedArray.length; i++) {
            System.out.println("Element " + i + " >> value is " + resizedArray[i]);
        }
        return  resizedArray;
    }

        public static void printArray (int [] MyArr){
            for (int i = 0; i < MyArr.length; i++) {
                System.out.println("Element " + i + " >> value is " + MyArr[i]);
            }

        }
        public static int smallestNumber (int [] MyArr) {
            int smallestNum = MyArr [0];
            for (int value : MyArr) {
                if (smallestNum > value) {
                    smallestNum = value;
                }
            }
            System.out.println("Smallest element in the array is " + smallestNum);
            return smallestNum;
        }

        public static int largestNumber (int [] MyArr){
            int largestNum = MyArr[0];
            for (int i = 0; i < MyArr.length; i++) {
                if (largestNum < MyArr[i]) {
                    largestNum = MyArr[i];
                }
            }
            System.out.println("Largest element in the array is " + largestNum);
            return largestNum;
        }

        public static int [] sortArray (int [] MyArr){
            int temp;
            for (int i = 1; i < MyArr.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (MyArr[j] < MyArr [j - 1]) {
                        temp = MyArr[j];
                        MyArr[j] = MyArr[j - 1];
                        MyArr[j - 1] = temp;
                    }
                }
            }
            int [] sortedArray =  new int [MyArr.length];
            for (int i=0; i<MyArr.length; i++){
                sortedArray [i] = MyArr[i];
            }
            // print sorted array
            System.out.println("################### Sorted Array ######################");
            for (int i = 0; i < MyArr.length; i++) {
                System.out.println("Element " + i + " >> value is " + sortedArray[i]);
            }
            System.out.println("#########################################");
            return  sortedArray;
        }
        public static int [] reverseArray (int [] MyArr){
        int [] reversedArray = new int [MyArr.length];
        int j = MyArr.length;
        for (int i = 0; i < reversedArray.length ; i++){
            reversedArray [j -1] = MyArr [i];
            j -=1;

        }
            // print reversed array
            System.out.println("Reversed Array: ");
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.println("Element " + i + " >> value is " + reversedArray[i]);
            }
            return reversedArray;
        }

        public static double averageValueNumbersArray (int [] MyArr){
        double sum = 0;
        for (int i = 0; i < MyArr.length; i++){
            sum += MyArr[i];
        }
        double average = sum / MyArr.length;
            System.out.println("Sum of numbers in the array: " + sum );
            System.out.println("Average of numbers in the array: "+ average);
            return average;
        }

        public static int [] sortArrayDescendingOrder (int [] MyArr){
        // sorting array
        int temp;
        for (int i = 1; i < MyArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (MyArr[j] < MyArr [j - 1]) {
                    temp = MyArr[j];
                    MyArr[j] = MyArr[j - 1];
                    MyArr[j - 1] = temp;
                    }
                }
            }
        // reversing array
            int [] reversedArray = new int [MyArr.length];
            int j = MyArr.length;
            for (int i = 0; i < reversedArray.length ; i++){
                reversedArray [j -1] = MyArr [i];
                j -=1;
            }
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.println("Element " + i + " >> value is " + reversedArray[i]);
            }
            return reversedArray;
        }
        // alternative reversing array - descending order
        public static int [] arrayReverseSorting2 (int [] MyArr){
        int [] sortedArray = Arrays.copyOf(MyArr, MyArr.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray [i+1]) {
                    temp = sortedArray[i];
                    sortedArray [i] = sortedArray [i +1];
                    sortedArray [i+1]= temp;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " >> value is " + sortedArray[i]);
        }
        return sortedArray;
        }

}
