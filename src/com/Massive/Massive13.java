package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive13 {


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new PowMassive().powM(scanner.nextInt());

    }

}

class PowMassive {

    public void powM(int n) {

        int[] massive = new int[n];

        for (int i = 0; i < n; i++) {

            massive[i] = (int) Math.pow(2,i + 1);

        }

        System.out.println(Arrays.toString(massive));

    }

}
