package com.VariantsAction;

import java.util.Scanner;

public class VariantAction1 {

    public static void main(String[] args) {

        CompareNumber compareNumber = new CompareNumber();

        compareNumber.ReadNumbers();
        compareNumber.LargeFirstSecond(compareNumber.getFIRST(), compareNumber.getSECOND());
        compareNumber.SmallFirstSecond(compareNumber.getFIRST(), compareNumber.getSECOND());


    }
}


abstract class Numbers {


    private transient double FIRST;
    private transient double SECOND;


    public void ReadNumbers() {

        Scanner scanner = new Scanner(System.in);

        this.FIRST = scanner.nextDouble();
        this.SECOND = scanner.nextDouble();

    }

    public double getFIRST() {
        return FIRST;
    }

    public double getSECOND() {
        return SECOND;
    }
}


class CompareNumber extends Numbers implements LargeNumbers,SmallLarge {



    @Override
    public void LargeFirstSecond(double FIRST, double SECOND) {
        LargeNumbers.super.LargeFirstSecond(FIRST, SECOND);
    }

    @Override
    public void SmallFirstSecond(double FIRST, double SECOND) {
        SmallLarge.super.SmallFirstSecond(FIRST, SECOND);
    }

}

interface LargeNumbers {

    default void LargeFirstSecond(double FIRST, double SECOND) {

        System.out.println(Math.max(FIRST, SECOND));

    }


}



interface SmallLarge {

    default void SmallFirstSecond(double FIRST, double SECOND) {

        System.out.println(Math.min(FIRST, SECOND));

    }

}

// task 4.1