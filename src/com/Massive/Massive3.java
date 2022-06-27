package com.Massive;

import java.util.Arrays;

public class Massive3 {

    public static void main(String[] args) {

        WriteInMassive writeInMassive = new WriteInMassive();
        writeInMassive.writeValueMassive();
        writeInMassive.printValue();


    }

}

final class WriteInMassive {

    private double[] massive;

    public void writeValueMassive() {

        massive = new double[15];

        for (int i = 0; i <= 14; i++) {

            massive[i] = Math.random();

        }


    }

    public void printValue() {

        System.out.println(Arrays.toString(massive));


    }


}
