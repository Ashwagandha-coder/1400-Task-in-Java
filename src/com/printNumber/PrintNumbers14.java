package com.printNumber;

import java.util.Scanner;

public class PrintNumbers14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mass[] = new int[3];

        for (int i = 0; i < 3; i++) {
            mass[i] = scanner.nextInt();
        }
        scanner.close();

        for (int j = 0; j <= 2; j++) {
            System.out.print(mass[j] + " ");
        }
    }
}

// Task 1.14