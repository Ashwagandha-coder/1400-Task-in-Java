package com.Massive;

import java.util.Arrays;
import java.util.Random;

public class Massive5 {

    public static void main(String[] args) {

        MassiveHight massiveHight = new MassiveHight();
        massiveHight.randomHight();
        massiveHight.printHight();

        massiveHight = null;

    }

}

class MassiveHight {

    private final int min = 163;
    private int max = 190;

    private int[] hight;

    public void randomHight() {

        hight = new int[12];

        for (int i = 0; i <= 11; i++) {

            hight[i] = randomValue(min,max);

        }

    }

    public int randomValue(int min , int max) {

        max -= min;

        return (int) (Math.random() * ++max) + min;

    }

    public void printHight() { System.out.println(Arrays.toString(hight)); }


}
