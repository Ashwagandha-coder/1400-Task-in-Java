package com.VariantsAction;

import java.util.Scanner;

public class VariantAction1 {

    public static void main(String[] args) {

        CompareNumber compareNumber = new CompareNumber();




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

        if (FIRST > SECOND)
            System.out.println(FIRST);
        else
            System.out.println(SECOND);

    }


}



interface SmallLarge {

    default void SmallFirstSecond(double FIRST, double SECOND) {

        if (FIRST < SECOND)
            System.out.println(FIRST);
        else
            System.out.println(SECOND);

    }

}