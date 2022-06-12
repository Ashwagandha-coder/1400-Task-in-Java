package com.For;

public class For20 {


    public static void main(String[] args) {

        new Payment20().paymentValue20();

    }
}

class Payment20 {

    public void paymentValue20() {

        for (double i = 0.1; i <= 0.9; i += 0.1) {

            System.out.println(Math.sqrt(i));

        }


    }


}
