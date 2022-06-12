package com.For;

public class For19 {


    public static void main(String[] args) {

        new Payment19().paymentValue19();

    }
}

class Payment19 {

    public void paymentValue19() {

        for (double i = 0.1; i <= 1.5; i += 0.1) {

            System.out.println(Math.sin(i));

        }


    }


}
