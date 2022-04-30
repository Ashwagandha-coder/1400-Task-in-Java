package com.For;

import java.util.Scanner;

public class For15 {


    public static void main(String[] args) {

        new PrintNumbers15().doSome15();


    }
}

final class PrintNumbers15 {

    MethodPrint15 methodPrint15 = a -> {

        for (int i = 1; i <= 9; i++) {
            System.out.print(a + " " + "x" + " " + i + " " + "=" + " " + a * i);
            System.out.println();
        }

    };

    public void doSome15() {

        Scanner scanner = new Scanner(System.in);

        methodPrint15.MethodPrintMultiply15(scanner.nextByte()); }


}


@FunctionalInterface
interface MethodPrint15 {

    void MethodPrintMultiply15(byte a);


}

// task 5.15