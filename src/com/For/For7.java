package com.For;

public class For7 {

    public static void main(String[] args) {

        new PrintPrice7().doSome7();

    }
}

final class PrintPrice7 {

    MethodPrint7 methodPrint7 = () -> {

        double a = 20.4;

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " " + (a * i));
            System.out.println();
        }

    };

    public void doSome7() { methodPrint7.methodPrintPrice7(); }

}

@FunctionalInterface
interface MethodPrint7 {

    void methodPrintPrice7();

}

// task 5.7