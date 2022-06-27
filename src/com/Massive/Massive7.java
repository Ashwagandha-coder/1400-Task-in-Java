package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive7 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        AddElemMassive addElemMassive = new AddElemMassive(scanner.nextInt());
        addElemMassive.addRandom();
        addElemMassive.printMassive();

    }

}

class AddElemMassive implements Add {

    private int[] massive;
    private final int n;

    public AddElemMassive(int n) {
        this.n = n;
    }

    @Override
    public boolean addRandom() {

        massive = new int[n];

        for (int i = 0; i <= n - 1; i++)
            massive[i] = (int) ( Math.random() % 10 + 1 * Math.random());

        return true;

    }

    public void printMassive() {

        System.out.println(Arrays.toString(massive));

    }

}

interface Add {

    boolean addRandom();

}


