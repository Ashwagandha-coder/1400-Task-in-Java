package com.Function;

import java.util.Scanner;

public class Function8 {

    public static void main(String[] args) {

        ScannerConsoleClass scannerConsoleClass = new ScannerConsoleClass();
        scannerConsoleClass.ScannerConsoleRead();
        scannerConsoleClass = null;
        new Payment().SumPerimetr();
        new Payment().SumSquare();
    }
}

final class ScannerConsoleClass {

    private int side_1_a;
    private int side_1_b;
    private int side_2_a;

    private int side_2_b;

    private int side_1_c;

    private int side_2_c;

    public int getSide_1_c() {
        return side_1_c;
    }

    public int getSide_2_c() {
        return side_2_c;
    }

    public int getSide_1_a() {
        return side_1_a;
    }

    public int getSide_1_b() {
        return side_1_b;
    }

    public int getSide_2_a() {
        return side_2_a;
    }

    public int getSide_2_b() {
        return side_2_b;
    }

    public void ScannerConsoleRead(){

        Scanner scanner = new Scanner(System.in);

        this.side_1_a = scanner.nextInt();
        this.side_1_b = scanner.nextInt();
        this.side_1_c = scanner.nextInt();
        this.side_2_a = scanner.nextInt();
        this.side_2_b = scanner.nextInt();
        this.side_2_c = scanner.nextInt();
    }
}
final class Payment implements SumPerimetrSquare, PerimetrSquare {



    @Override
    public void SumPerimetr() {

        System.out.println(this.Perimetr1() + this.Perimetr2());

    }


    @Override
    public void SumSquare() {

        System.out.println(this.Square1() + this.Square2());

    }




    @Override
    public int Perimetr1() {

        ScannerConsoleClass scannerConsoleClass = new ScannerConsoleClass();

        return scannerConsoleClass.getSide_1_a() + scannerConsoleClass.getSide_1_b() + scannerConsoleClass.getSide_1_c() ;
    }


    @Override
    public int Square1() {

        int p = Perimetr1();

        ScannerConsoleClass scannerConsoleClass = new ScannerConsoleClass();


        return (int) Math.pow(p * (p - scannerConsoleClass.getSide_1_a()) * (p - scannerConsoleClass.getSide_1_b()) * (p - scannerConsoleClass.getSide_1_c()),0.5);
    }


    @Override
    public int Perimetr2() {

        ScannerConsoleClass scannerConsoleClass = new ScannerConsoleClass();

        return scannerConsoleClass.getSide_2_a() + scannerConsoleClass.getSide_2_b() + scannerConsoleClass.getSide_2_c() ;
    }


    @Override
    public int Square2() {

        int p = Perimetr2();
        ScannerConsoleClass scannerConsoleClass = new ScannerConsoleClass();

        return (int) Math.pow(p * (p - scannerConsoleClass.getSide_2_a()) * (p - scannerConsoleClass.getSide_2_b()) * (p - scannerConsoleClass.getSide_2_c()),0.5);
    }
}

sealed interface SumPerimetrSquare permits Payment {

    void SumPerimetr();

    void SumSquare();


}

sealed interface PerimetrSquare permits Payment {

    int Perimetr1();

    int Square1();

    int Perimetr2();

    int Square2();

}


// task 14.8

// chains call




