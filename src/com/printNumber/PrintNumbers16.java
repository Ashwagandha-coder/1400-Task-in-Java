package com.printNumber;

import java.util.Scanner;

public class PrintNumbers16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] mass = new int[5];

        for (int i = 0; i <= 4; i++) {
            mass[i] = scanner.nextInt(); // добавление чисел по порядку варианты а,б,в
        }

        System.out.println(5 + " " + 10);
        System.out.println(7 + " " + "cm");

        System.out.println(100 + " " + mass[0]);
        System.out.println(1949 + " " + mass[1]);

        System.out.println(mass[2] + " " + 25);
        System.out.println(mass[3] + " " + mass[4]);


    }
}

// Task 1.16