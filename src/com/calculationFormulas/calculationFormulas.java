package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas {

    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        */

        int y = 17;

        int Discriminant = (int) (Math.pow(6,2) * (-1) + (4 * 17 * 13));

        int x1 = (int) (6 - Math.pow(Discriminant,(0.5)) / (2 * 17));
        int x2 = (int) (6 + Math.pow(Discriminant,(0.5)) / (2 * 17));

        System.out.println(x1 + " " + x2);

    }
}
// Task 2.1
