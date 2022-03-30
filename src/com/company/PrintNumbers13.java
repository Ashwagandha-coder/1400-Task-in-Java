package com.company;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);


        printStream.println("Следущее число за числом" + " " + number +" " + "число" + " " + (number + 1));
        printStream.println("Для числа" + " " + number + " " + "преддущее число" + " " + (number - 1));

    }
}
// Task 1.13
