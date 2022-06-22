package com.Massive;

import java.util.Arrays;

public class Massive4 {

    public static void main(String[] args) {

       WriteValueInStringMassive w = new WriteValueInStringMassive();
       w.writeInMassieve2();
       w.printMassive2();

    }

}

class WriteValueInStringMassive {

    private char[] massive;

    public void writeInMassieve2() {

        massive = new char[20];

        for (int i = 0; i <= 19; i++) {

            massive[i] = '#';

        }

    }

    public void printMassive2() {

        System.out.println(Arrays.toString(massive));


    }




}
