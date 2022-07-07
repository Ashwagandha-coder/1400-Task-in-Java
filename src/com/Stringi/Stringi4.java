package com.Stringi;

import java.util.Scanner;

public class Stringi4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();


        String f1 = str1;
        String f2 = str2;

        printV(f1,f2);
    }


    public static void printV(String s1, String s2) {

        System.out.println(s1 + " " + s2);


    }
}