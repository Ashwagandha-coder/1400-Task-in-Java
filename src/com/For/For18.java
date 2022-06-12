package com.For;

public class For18 implements Payment18 {


    public static void main(String[] args) {

       new For18().paymentValue18();

    }
}

interface Payment18 {

    default void paymentValue18() {

        for (int i = 2; i <= 17; i++) {

            int t = 3 * i;
            double z = 4.3 * Math.pow(t,2) - 8 * t + 13;
            System.out.println(z);


        }


    }

}