package com.calculationFormulas;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class calculationFormulas9 {

    public static void main(String[] args) {

        double[] result = new double[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            result[i] = scanner.nextInt();
        }

        Formulas(result);


    }
    public static void Formulas(double @NotNull [] result) {

        double res1;
        double res2;

        res1 = (int) (2 * Math.pow(result[0],3)) - (3.44 * result[0] * result[1]) + 2.3 * Math.pow(result[0],2)- 7.1 * result[1] + 2;
        res2 = (int) (3.14 * Math.pow((result[2] + result[3]),3) + 2.75 * Math.pow(result[3],2) - 12.7 * result[2] - 4.1);

        System.out.println(res1 + " " + res2);
    }
}

// Task 2.9
