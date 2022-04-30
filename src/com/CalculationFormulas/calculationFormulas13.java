package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Resulut(a,b));

    }
    public static double Resulut(double a, double b) {

        return (-b) / a;

    }
}
// Task 2.13
