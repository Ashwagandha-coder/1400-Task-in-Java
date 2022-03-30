package com.printNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println(name);

    }
}

// Task 1.10
