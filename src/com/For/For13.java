package com.For;

public class For13 {


    public static void main(String[] args) {

        new PrintNumbers13().doSome();

    }
}

final class PrintNumbers13 {

    MethodPrint13 methodPrint13 = () -> {

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " " + "x" + " " + "7" + " " + "=" + " " + i * 7);
            System.out.println();
        }

    };

    public void doSome() { methodPrint13.MethodPrintMultiply(); }


}


@FunctionalInterface
interface MethodPrint13 {

    void MethodPrintMultiply();

}

// task 5.13
