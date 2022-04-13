package com.VariantsAction;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class VariantsAction29 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ChisloTwo chisloTwo = new ChisloTwo(scanner.nextInt(), scanner.nextInt());
        chisloTwo.CalculateA();
        chisloTwo.CalculationB();

    }
}

record ChisloTwo(int CHISLO, int PARAMETR) {

    public void CalculateA() {

        PrintStream printStream = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        if (CHISLO % 3 == 0)
            printStream.println(" Да ");
        else
            printStream.println(" Нет ");

    }

    public void CalculationB() {

        PrintStream printStream = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        int a = CHISLO / 10;
        int b = CHISLO % 10;

        if (a + b % PARAMETR == 0)
            printStream.println(" Да ");
        else
            printStream.println(" Нет ");
    }

}
