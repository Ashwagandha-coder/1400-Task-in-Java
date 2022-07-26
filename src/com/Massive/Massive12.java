package com.Massive;

import java.util.Arrays;

public class Massive12 {


    public static void main(String[] args) {

        new ReverseMassive().reverse();

    }

}

class ReverseMassive {

    public void reverse() {

        int[] massiveReverse = new int[20];

        int j = 0;

        for (int i = 20; i >= 1; i--) {

            massiveReverse[j] = i;
            j++;

        }

        System.out.println(Arrays.toString(massiveReverse));


    }


}
