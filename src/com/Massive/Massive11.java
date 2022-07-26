package com.Massive;

import java.util.Arrays;

public class Massive11 {

    public static void main(String[] args) {

        new FullNaturalMassive().fullMassive();

    }

}

class FullNaturalMassive {

    public void fullMassive() {

        int[] massive = new int[27];

        for (int i = 0; i <= 24; i++) {

            massive[i] = i + 1;

        }
        massive[25] = 100;
        massive[26] = 200;

        System.out.println(Arrays.toString(massive));

    }


}
