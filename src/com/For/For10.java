package com.For;

import java.util.Scanner;

public class For10 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PrintMoney10(scanner.nextDouble()).doSome10();

    }
}

final class PrintMoney10 {

    private transient double CURS;

    public PrintMoney10(double CURS) {
        this.CURS = CURS;
    }


    MethodPrint10 methodPrint10 = () -> {

        System.out.println("Count" + " " + "Price");
        System.out.println();

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " " + ((double) i * this.CURS));
            System.out.println();
        }

    };

    public void doSome10() { methodPrint10.MethodPrintMoney10(); }


}

@FunctionalInterface
interface MethodPrint10 {

    void MethodPrintMoney10();

}

// task 5.10