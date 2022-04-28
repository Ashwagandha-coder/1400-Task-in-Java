package com.For;

public class For6 {

    public static void main(String[] args) {

        new PrintNumbers6().doSome6();

    }
}

final class PrintNumbers6  {

    MethodPrints6 methodPrints6 = () -> {

        for (int i = 20; i <= 35; i++) {
            System.out.print(i + " " + ((double) i - 0.6));
            System.out.println();
        }
        System.out.println();

        for (int j = 16; j <= 24; j++) {
            System.out.print(j + " " + ((double) j - 0.5) + " " + ((double) j + 0.8));
            System.out.println();
        }

    };

    public void doSome6() { methodPrints6.methodPrintNumbers6(); }
}
@FunctionalInterface
interface MethodPrints6 {

    void methodPrintNumbers6();


}

// task 5.6