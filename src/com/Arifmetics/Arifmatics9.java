package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics9 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        new PaymentTime().TestPaymentTime(scanner.nextInt());

    }
}

class PaymentTime {

    public void TestPaymentTime(int x) {

        System.out.println(x / 3600);



    }


}

// task 3.9