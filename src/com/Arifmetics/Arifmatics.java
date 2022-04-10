package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Translation translation = new Translation(scanner.nextInt());
        translation.metrSantimetr();
        translation.printMetr();

    }
}
class Translation implements Metr {

    private transient final int santi;
    private transient int metr;

    public Translation(int santi) {

        this.santi = santi;

    }


    @Override
    public void metrSantimetr() {

        this.metr = santi / 100;


    }
    @FirstAnnotation
    public void printMetr() {

        System.out.println(metr);

    }

}



interface Metr {

    void metrSantimetr();

}