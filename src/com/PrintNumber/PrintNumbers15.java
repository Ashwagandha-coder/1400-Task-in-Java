package com.PrintNumber;

import java.util.Scanner;

public class PrintNumbers15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mass[] = new int[4];

        for (int i = 0; i <= 3; i++) {
            mass[i] = scanner.nextInt();
        }

        for (int j = 0; j <= 3; j++) {
            System.out.print(mass[j] + " ");
        }

    }
}

// Task 1.15