package com.For;

public class For14 {


    public static void main(String[] args) {

        new PrintNumbers14().doSome14();

    }
}

final class PrintNumbers14 {

    MethodPrint14 methodPrint14 = () -> {

        for (int i = 1; i <= 9; i++) {
            System.out.print(9 + " " + "x" + " " + i + " " + "=" + " " + i * 9);
            System.out.println();
        }

    };

    public void doSome14() { methodPrint14.MethodPrintMultiply14(); }


}


@FunctionalInterface
interface MethodPrint14 {

    void MethodPrintMultiply14();

}

// task 5.14
