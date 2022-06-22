package com.Massive;

import java.util.Arrays;

public class Massive6 {


    public static void main(String[] args) {

        new MassiveWeight();

    }

}

final class MassiveWeight {

    private int[] weight;

    private final int min = 50;
    private int max = 100;

    public MassiveWeight() {

        writeWeight();
        printValue3();

    }

    public void writeWeight() {

        weight = new int[20];

        for (int i = 0; i <= 19; i++) {

            weight[i] = randomValue2(min, max);

        }


    }
    public void printValue3() {
        System.out.println(Arrays.toString(weight));
    }

    public int randomValue2(int min, int max) {

        max -= min;

        return (int) (Math.random() * ++max) + min;

    }

}
