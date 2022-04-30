package com.PrintNumber;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintNumbers17 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] mass = new int[5];

        for (int i = 0; i <= 4; i++) {
            mass[i] = scanner.nextInt();
        }

        String weight = "кг";

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);


        printStream.println(2 + " " + weight);
        System.out.println(13 + " " + 17);

        System.out.println(mass[0] + " " + 1);
        System.out.println(19 + " " + mass[1]);

        System.out.println(mass[2] + " " + mass[3]);
        System.out.println(5 + " " + mass[4]);




    }
}

// Task 1.17