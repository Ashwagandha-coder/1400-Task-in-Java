package com.For;

import java.util.Scanner;

public class For22 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new Payment22().paymentValue22(scanner.nextInt());

    }
}

class Payment22 {

    public void paymentValue22(int kilograms) {

        for (int i = 100; i <= 2000; i += 100) {

            System.out.println((double) kilograms * i / 1000);


        }


    }


}
