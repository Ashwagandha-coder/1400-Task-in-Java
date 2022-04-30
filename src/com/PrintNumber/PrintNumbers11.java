package com.PrintNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String FC = scanner.nextLine();
        String message = "эта команда чемпион";

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.print(FC);
        printStream.print(" - ");
        printStream.print(message);

    }
}
// Task 1.11
