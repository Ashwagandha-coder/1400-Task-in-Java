package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas12 {


    public static void main(String[] args) {

        int count;
        int square;

        Scanner scanner = new Scanner(System.in);

        count = scanner.nextInt();
        square = scanner.nextInt();

        System.out.println(Dencity(count,square));

    }

    public static double Dencity(double count, double square) {

        return count / square;

    }

}
// Task 2.12
