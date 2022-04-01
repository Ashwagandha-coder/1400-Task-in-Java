package com.Stringi;

import java.util.Scanner;

public class Stringi {

    public static void main(java.lang.String[] args) {

        java.lang.String name;
        java.lang.String SurName;

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        SurName = scanner.nextLine();

        scanner.close();

        PrintString(name,SurName);
    }
    public static void PrintString(String name, String SurName) {

        System.out.println(name + " " + SurName);

    }

}
// Task 12.1
