package com.For;

public class For5 {

    public static void main(String[] args) {

        new PrintNumbers5().doSome2();

    }
}

final class PrintNumbers5 {

    MethodPrint5 methodPrint5 = () -> {

        for (int i = 21; i >= 10; i--) {
            System.out.print(i + " " + ((double) i - 1.8));
            System.out.println();
        }
        System.out.println();

        for (int j = 45; j >= 25; j--) {
            System.out.print(j + " " + ((double) j - 0.5) + " " + ((double) j - 0.8));
            System.out.println();
        }

    };

    public void doSome2() { methodPrint5.methodPrintNumbers5(); }


}

@FunctionalInterface
interface MethodPrint5 {

    void methodPrintNumbers5();

}

// task 5.5