package com.Massive;

import java.util.Scanner;

public class Massive8 {


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PrintElemeMassive(scanner.nextInt()).printIndex();

    }

}

class PrintElemeMassive {

    private final int INDEX;

    public PrintElemeMassive(int INDEX) {
        this.INDEX = INDEX;
    }

    public void printIndex() {

        int[] massive = new int[INDEX];

        for (int i = 0; i <= INDEX - 1; i++)
            massive[i] = 1;

        System.out.println(massive[INDEX - 1]);



    }
}
