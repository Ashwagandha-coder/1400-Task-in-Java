package com.For;

public class For17 {


    public static void main(String[] args) {

        new Payment17().paymentValue17();

    }
}

class Payment17 {

    public void paymentValue17() {

        for (int i = 4; i <= 28; i++) {

            int t = i + 3;
            double y = 3 * Math.pow(t,2) + 4.87 * t - 3;
            System.out.println(y);


        }


    }


}