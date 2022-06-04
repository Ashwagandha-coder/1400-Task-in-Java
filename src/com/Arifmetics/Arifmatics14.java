package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics14 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PaymentHouse().TestPaymentHouse(scanner.nextInt());

    }
}

class PaymentHouse {

    public void TestPaymentHouse(int x) {

        if (x <= 54)
            System.out.println(1);
        else if (x > 54 && x <= 108)
            System.out.println(2);
        else if (x > 108 && x <= 162)
            System.out.println(3);
        else
            System.out.println(4);


    }


}

// task 3.14