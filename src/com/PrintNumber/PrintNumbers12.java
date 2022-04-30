package com.PrintNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String word1 = "Привет";

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.print(word1);
        printStream.print(",");
        printStream.print(" ");
        printStream.print(name);
        printStream.print("!");
    }
}
// Task 1.12
