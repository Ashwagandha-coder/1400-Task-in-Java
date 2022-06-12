package com.For;

import java.util.Scanner;

public class For21 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new Payment21().paymentValue21(scanner.nextInt());

    }
}

class Payment21 {

    public void paymentValue21(int kilograms) {

        for (int i = 50; i <= 1000; i += 50) {

            System.out.println((double) kilograms * i / 1000);

        }

    }

}
