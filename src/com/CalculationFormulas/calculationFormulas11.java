package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int v = scanner.nextInt();

        Density(m,v);

    }
    public static void Density(int m, int v) {

        double p = (m / v);

        System.out.println(p);

    }

}
// Task 2.11
