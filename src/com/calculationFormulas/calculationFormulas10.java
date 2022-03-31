package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Average(number1,number2);


    }
    public static void Average(int number1, int number2) {

        int average = (number1 + number2) / 2;
        int AverageGeom = (int) Math.pow((number1 * number2), 0.5);

        System.out.println(average + " " + AverageGeom);

    }
}
// Task 2.10