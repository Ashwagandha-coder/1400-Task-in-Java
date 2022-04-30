package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int x = scanner.nextInt();
        int expression_A = (int) ((2 * a) + Math.sin(3 * a) / 3.56);
        int expression_B = (int) (3.2 + Math.pow((1 + x),0.5) / (5 * x));

        int function_A = (int) Math.pow(expression_A,0.5);

        int function_B = (int) Math.sin(expression_B);

        System.out.println(function_A);
        System.out.println(function_B);

    }
}
// Task 2.3