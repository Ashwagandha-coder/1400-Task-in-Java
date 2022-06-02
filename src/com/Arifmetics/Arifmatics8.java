package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics8 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PaymentPlace().TestPaymentPlace(scanner.nextDouble());

    }
}

class PaymentPlace {

    public void TestPaymentPlace(double x) {

        if (x % 15 == 0)
            System.out.println((int) x / 15);
        else
            System.out.println((int) x / 15 + 1);



    }


}

// task 3.8