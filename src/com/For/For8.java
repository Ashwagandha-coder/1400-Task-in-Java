package com.For;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class For8 {

    public static void main(String[] args) {

        new PrintWeight8().doSome8();

    }
}

final class PrintWeight8 {

    MethodPrint8 methodPrint8 = () -> {

        new PrintStream(System.out,true, StandardCharsets.UTF_8).print("Фунты" + "  " + "Кг");
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print("  " + i + "     " + (double) i * 0.45);
            System.out.println();

        }

    };

    public void doSome8() { methodPrint8.methodPrintWeight8(); }


}

@FunctionalInterface
interface MethodPrint8 {

    void methodPrintWeight8();

}

// task 5.8