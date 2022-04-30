package com.PrintNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers8 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String message = "Вы ввели число";

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8); // Потоковй ввод-ввод 3 параметра в конструкторе

        printStream.println(message);
        System.out.println(number);

    }
}
// Task 1.8
