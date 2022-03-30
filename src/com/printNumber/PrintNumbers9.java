package com.printNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        PrintStream printStream = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        String message = "вот такое число вы ввели";


        System.out.println(number);
        printStream.println(message);

    }
}

// Task 1.9
