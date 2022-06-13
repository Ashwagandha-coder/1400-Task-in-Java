package com.RepeatActionOperation;

import java.util.Scanner;

public class RepeatActionOperation6 {


    public static void main(String[] args) {

        RepeatAction6.numberFromFactorial(RepeatAction6.scannerValue6());

    }
}

class RepeatAction6 {


    public static int scannerValue6() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();


    }

    public static void numberFromFactorial(int n) {

        int factorial = RepeatAction6.factorialNumber(n - 1);

        System.out.println(n / factorial);



    }


    public static int factorialNumber(int n) {

        int result = 1;

        for (int i = n; i >= 1; i--) {

            result *= i;

        }

        return result;

    }


}

// Недоделал
