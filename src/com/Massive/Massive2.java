package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive2 {


    public static void main(String[] args) {

        WriteMassive writeMassive = new WriteMassive();
        writeMassive.scannerAndWrite();
        writeMassive.printMassive();

    }

}

class WriteMassive {

    private int[] massive;

    public void scannerAndWrite() {

        Scanner scanner = new Scanner(System.in);
        massive = new int[10];

        for (int i = 0; i <= 9; i++) {

            massive[i] = scanner.nextInt();

        }


    }

    public void printMassive() {

        System.out.println(Arrays.toString(massive));

    }

}
