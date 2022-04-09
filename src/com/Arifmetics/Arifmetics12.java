package com.Arifmetics;

import java.util.Scanner;

public class Arifmetics12 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        House house = new House(20,5,scanner.nextInt());
        house.floor();
        house.floorAccount();

    }

}
class House implements Two, One {

    private transient final int COUNT_FLAT;
    private transient final int ACCOUNT_FLOOR;

    private transient int flat;


    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }



    public House(int COUNT_FLAT, int ACCOUNT_FLOOR, int flat) {
        this.COUNT_FLAT = COUNT_FLAT;
        this.ACCOUNT_FLOOR = ACCOUNT_FLOOR;
        this.flat = flat;
    }


    @Override
    public void floor() {

        int[] floor1 = new int[4];
        int[] floor2 = new int[4];
        int[] floor3 = new int[4];
        int[] floor4 = new int[4];
        int[] floor5 = new int[4];

        for (int i = 0; i <= 4; i++) {

            floor1[i] = i + 1;

        }

        for (int i = 4; i <= 8; i++) {

            floor2[i] = i + 1;

        }

        for (int i = 8; i <= 12; i++) {

            floor3[i] = i + 1;

        }

        for (int i = 12; i <= 16; i++) {

            floor4[i] = i + 1;

        }

        for (int i = 16; i <= 20; i++) {

            floor5[i] = i + 1;

        }



        for (int j: floor1) {

            if (j == flat)
                System.out.println(1);
        }

        for (int j: floor2) {

            if (j == flat)
                System.out.println(2);
        }

        for (int j: floor3) {

            if (j == flat)
                System.out.println(3);
        }

        for (int j: floor4) {

            if (j == flat)
                System.out.println(4);
        }

        for (int j: floor5) {

            if (j == flat)
                System.out.println(5);
        }
    }

    @Override
    public void floorAccount() {

        if (flat % 4 == 1)
            System.out.println(1);
        if (flat % 4 == 2)
            System.out.println(2);
        if (flat % 4 == 3)
            System.out.println(3);
        if (flat % 4 == 4)
            System.out.println(4);

    }
}

