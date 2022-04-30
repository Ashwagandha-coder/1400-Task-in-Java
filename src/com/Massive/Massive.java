package com.Massive;

public class Massive {

    public static void main(String[] args) {

        int[] mass = new int[8];
        mass[0] = 37;
        mass[1] = 0;
        mass[2] = 50;
        mass[3] = 46;
        mass[4] = 34;
        mass[5] = 46;
        mass[6] = 0;
        mass[7] = 13;

        PrintMass(mass);
    }
    public static void PrintMass(int[] mass) {

        for (int i = 0; i <= 7; i++) {
            System.out.println(mass[i]);
        }

    }
}
// Task 11.1
