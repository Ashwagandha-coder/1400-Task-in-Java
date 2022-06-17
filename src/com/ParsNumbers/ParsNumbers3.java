package com.ParsNumbers;

import java.util.Scanner;

public class ParsNumbers3 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PrintForCheckValue().check(scanner.nextDouble());

    }
}

class PrintForCheckValue {

    public void check(double value) {

        for (double i = 1; i <= 10; i++) {

            if ((double) 1 / i < value)
                System.out.println((double) 1 / i);

        }


    }

}
