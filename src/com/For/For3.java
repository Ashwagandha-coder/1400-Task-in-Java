package com.For;


import java.util.Scanner;

public class For3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        byte a = scanner.nextByte();
        byte b = scanner.nextByte();


       PrintNumbers3 printNumbers3 = new PrintNumbers3();
       printNumbers3.printA();
       printNumbers3.printB(a);
       printNumbers3.printV(b);
       printNumbers3.printG(a,b);

    }
}

class PrintNumbers3 implements Print3 {

    @Override
    public void printA() {

        for (int i = 20; i <= 35; i++)
            System.out.println(i);

        System.out.println(" ");

    }


    @Override
    public void printB(byte a) {

        for (int i = a; i <= 49; i++)
            System.out.println(Math.pow(i,2));

        System.out.println(" ");

    }


    @Override
    public void printV(byte b) {

        for (int i = 9; i < b; i++)
            System.out.println(Math.pow(i,3));

        System.out.println(" ");

    }

    @Override
    public void printG(byte a, byte b) {


        for (int i = a; i <= b; i++)
            System.out.println(i);

        System.out.println(" ");

    }
}

interface Print3 {

    void printA();

    void printB(byte a);

    void printV(byte b);

    void printG(byte a, byte b);

}