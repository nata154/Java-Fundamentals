package com.training.epam.javaFundamentals.operators;

import java.util.Scanner;

public class DoNumberBelongToInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[args.length];

        //while (!(args == null)) {
        for (int i = 0; i < args.length; i++) {
            //numbers[i] = sc.nextInt();
            numbers[i] = Integer.parseInt(args[i]);
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        System.out.println();

        int numberWhichWeDetectBelonging = numbers [0];
        int minLimit = numbers [1];
        int maxLimit = numbers [2];

        if (  (numberWhichWeDetectBelonging >= minLimit)   &   (numberWhichWeDetectBelonging < maxLimit)  ){
            System.out.println("Do number " + numberWhichWeDetectBelonging + " belong to interval " + "[" +minLimit + ", " +maxLimit + ") ?");
            System.out.println('\t' + "yes, the number "  + numberWhichWeDetectBelonging + " belongs to interval  " + "[" +minLimit + ", " +maxLimit + ").");
        } else {
            System.out.println("Do number " + numberWhichWeDetectBelonging + " belong to interval " + "[" +minLimit + ", " +maxLimit + ") ?");
            System.out.println('\t' + "No, the number "  + numberWhichWeDetectBelonging + " doesn't belong to interval  " + "[" +minLimit + ", " +maxLimit + ").");
        }



    }
}
