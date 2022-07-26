package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive15 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] massive = new int[8];

        for (int i = 0; i<8; i++) {

            massive[i] = scanner.nextInt();

        }

        new SomeClass(massive).doSome();

    }

}

class SomeClass {

    private int[] massive;

    public SomeClass(int... elem) {
        massive = elem;
    }

    public void doSome() {


        Arrays.sort(massive);


        System.out.println(Arrays.toString(massive));


    }
}
