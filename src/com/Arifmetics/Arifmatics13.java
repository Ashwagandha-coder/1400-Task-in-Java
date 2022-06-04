package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics13 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PaymentTable().TestPaymentTable(scanner.nextInt());

    }
}

class PaymentTable {


    public void TestPaymentTable(int x) {

        if (x % 5 == 0)
            System.out.println(x / 5);
        else
            System.out.println(x / 5 + 1);


    }


}

// task 3.13