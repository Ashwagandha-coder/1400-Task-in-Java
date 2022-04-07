package com.Test;

public class Test3 {

    public static void main(String[] args) {

        Print3();

    }
    public static void Print() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i + " " + "three");
            }
            else if (i % 5 == 0) {
                System.out.println(i + " " + "five");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " " + "three" + " " + "five");
            }
            else {
                System.out.println(i);
            }


        }

    }


    public static void Print2() {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.print("three" + " ");
            }
            if (i % 5 == 0) {
                System.out.print("five");
            }
            System.out.println("");
        }

    }


    public static void Print3() {

        String a = "";

        for (int i = 1; i <= 100; i++) {
            a = String.valueOf(i);
            if (i % 3 == 0) {
                a = String.valueOf(a) + " " + "three" + " ";
            }
            if (i % 5 == 0) {
                a = String.valueOf(a) + " " + "five";
            }
            System.out.println(a);

        }

    }
}

