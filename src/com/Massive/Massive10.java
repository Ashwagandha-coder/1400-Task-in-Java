package com.Massive;

import java.util.Arrays;

public class Massive10 {


    public static void main(String[] args) {

        new FullMassive().addElem();

    }

}

class FullMassive {

    public void addElem() {

        int[] massive = new int[12];

        for (int i = 0; i <= 11; i++) {
            massive[i] = i + 1;
        }

        System.out.println(Arrays.toString(massive));


    }


}
