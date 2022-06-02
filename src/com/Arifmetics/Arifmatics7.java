package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics7 {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PayMentFlat().PaymentFlat(scanner.nextDouble());

    }
}

class PayMentFlat {

    public void PaymentFlat(double x) {

        if ((x / 3) * 10 % 10 > 0)
            System.out.println((int) x / 3 + 1);
        else
            System.out.println((int) x / 3);

    }


}

// task 3.7