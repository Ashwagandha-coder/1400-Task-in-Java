package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction49 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Input input = new Input(scanner.nextInt(), scanner.nextInt());
        input.InputChislo();

    }
}

record Input(int param, int A) {

    public void InputChislo() {

        int CHISLO = 3;

        if (CHISLO < param)
            System.out.println(" Yes ");
        else
            System.out.println(" No ");


        if (A < param)
            System.out.println(" Yes ");
        else
            System.out.println(" No ");

    }

}
