package com.For;

public class For16 {


    public static void main(String[] args) {


        new PrintNumbers16().doSome16();

    }
}

final class PrintNumbers16 {

    MethodPrint16 methodPrint16 = () -> {

        for (float i = (float) 0.1; i <= 1.6; i += 0.1) {
            System.out.print("sin" + " " + i + " " + "=" + " " + Math.sin(i));
            System.out.println();
        }

    };

    public void doSome16() { methodPrint16.MethodPrintSin16(); }


}

@FunctionalInterface
interface MethodPrint16 {

    void MethodPrintSin16();

}

// task 5.16
