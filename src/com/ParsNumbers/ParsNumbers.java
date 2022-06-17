package com.ParsNumbers;

import java.util.Scanner;

public class ParsNumbers {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new CheckValue().checkValueOpr(scanner.nextInt());

    }
}

class CheckValue {

    public void checkValueOpr(int value) {

        if (value < 1)
            System.out.println(1);
        if (value < 4)
            System.out.println(4);
        if (value < 9)
            System.out.println(9);
        if (value < 16)
            System.out.println(16);
        if (value < 25)
            System.out.println(25);




    }



}
