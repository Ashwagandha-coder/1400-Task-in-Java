package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive14 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new FullingMassive().foo(scanner.nextInt());

    }

}

class FullingMassive {

    public void foo(int n) {

        int[] massive = new int[n];

        int j = 0;

        for (int i = n; i >= 1; i--) {

            massive[j] = i;
            j++;

        }

        System.out.println(Arrays.toString(massive));
    }

}
