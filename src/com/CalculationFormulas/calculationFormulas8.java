package com.CalculationFormulas;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class calculationFormulas8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();


        for (int i = 0; i <= 1; i++) {
            double[] res = Circle(radius);
            System.out.println(res[i]);
        }

    }
    @Contract(pure = true)
    public static double[] Circle(int radius) {
        double pi = 3.14;

        double p = 2 * pi * radius;
        double s = Math.pow((pi * radius),2);

        double[] result = new double[2];
        result[0] = p;
        result[1] = s;


        return result;
    }
}
// Task 2.8
