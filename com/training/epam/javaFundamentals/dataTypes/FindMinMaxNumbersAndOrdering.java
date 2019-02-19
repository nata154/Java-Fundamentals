package com.training.epam.javaFundamentals.dataTypes;

import java.util.Scanner;

public class FindMinMaxNumbersAndOrdering {
    public static void main(String[] args) {
        if (args == null) {
            System.out.println("Please enter the numbers divided by space. like 1 2 10 233");
            System.out.println("Enter 'exit' to escape");
        } else if (args.equals("exit")) {
            System.out.println("Bye!");
        } else {
//------------------------------------------------------------------------------------------
            //min Number
            String minString = args[0];
            int minStringLenght = args[0].length();

            for (int i = 0; i < args.length; i++) {
                if (minString.length() > args[i].length()) {
                    minString = args[i];
                    minStringLenght = args[i].length();
                }
            }

            Integer minNumber = Integer.parseInt(minString);
            int minNumberLenght = minNumber.toString().length();
            System.out.println("The shortest number is " + minString + ", the length of this number is " + minStringLenght + ".");
            System.out.println("The shortest number is " + minNumber + ", the length of this number is " + minNumberLenght + ".");

            System.out.println();
//------------------------------------------------------------------------------------------
            //max Number

            String maxString = args[0];
            int maxStringLenght = args[0].length();

            for (int i = 0; i < args.length; i++) {
                if (maxString.length() < args[i].length()) {
                    maxString = args[i];
                    maxStringLenght = args[i].length();
                }
            }

            Integer maxNumber = Integer.parseInt(maxString);
            int maxNumberLenght = maxNumber.toString().length();
            System.out.println("The largest number is " + maxString + ", the length of this number is " + maxStringLenght + ".");
            System.out.println("The largest number is " + maxNumber + ", the length of this number is " + maxNumberLenght + ".");
            System.out.println();
//------------------------------------------------------------------------------------------
            //ordered by value from min to max
            int[] numbers = new int [args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Array before ordering: ");
            for (int num: numbers) {
                System.out.print('\t');
                System.out.print(num + ", ");
            }
            System.out.println();
            System.out.println();

            int [] numbersForMinMaxOrdering = numbers;
            for(int i = numbersForMinMaxOrdering.length-1; i>0; i--){
                for (int j = 0; j<i; j++) {
                    if (numbersForMinMaxOrdering[j] > numbersForMinMaxOrdering[j + 1]) {
                        int temp = numbersForMinMaxOrdering[j];
                        numbersForMinMaxOrdering[j] = numbersForMinMaxOrdering[j + 1];
                        numbersForMinMaxOrdering[j + 1] = temp;
                    }
                }
                }
            System.out.println("Array after ordering from min to max value: ");
            for (int num: numbersForMinMaxOrdering) {
                System.out.print('\t');
                System.out.print(num + ", ");
            }
            System.out.println();
//------------------------------------------------------------------------------------------
                    }
    }
}


