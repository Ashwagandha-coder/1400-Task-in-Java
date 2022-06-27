package com.Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Massive9 {


    public static void main(String[] args) {

        ViceVersaMassive viceVersaMassive = new ViceVersaMassive();
        viceVersaMassive.initMassive();
        viceVersaMassive.viceVersaPrintMassive();

    }

}

final class ViceVersaMassive {

    private int[] massive;

    public void initMassive() {

        massive = new int[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {

            massive[i] = scanner.nextInt();

        }


    }

    public void viceVersaPrintMassive() {

        int length_massive = massive.length - 1;

        int[] newMassive = new int[massive.length];

        for (int i = 0; i <= massive.length - 1; i++) {

            newMassive[i] = massive[length_massive - i];

        }

        System.out.println(Arrays.toString(newMassive));


    }


}
