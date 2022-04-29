package com.For;

public class For9 {

    public static void main(String[] args) {

        new PrintNumbers9().doSome9();


    }
}

final class PrintNumbers9 {

    MethodPrint9 methodPrint9 = () -> {

        for (int i = 10; i <= 22; i++) {
            System.out.print(i + " " + ((double) i * 2.54));
            System.out.println();
        }

    };

    public void doSome9() { methodPrint9.methodPrintDistance9(); }


}


@FunctionalInterface
interface MethodPrint9 {

    void methodPrintDistance9();

}

// task 5.9