package com.ParsNumbers;

import java.util.Scanner;

public class ParsNumbers2 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new CheckValue2().checkValueOpr2(scanner.nextInt());

    }
}

class CheckValue2 {

    public void checkValueOpr2(int value) {

        if (value > 1)
            System.out.println(1);


    }



}
