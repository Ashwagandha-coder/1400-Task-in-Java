package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction31 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        CompareNumbers compareNumbers = new CompareNumbers(scanner.nextInt());
        compareNumbers.Split();
        compareNumbers.OneThree();
        compareNumbers.OneTwo();
        compareNumbers.TwoThree();

    }
}
class CompareNumbers implements ConcreteCompareNumbers {

    private transient final int CHISLO;

    private transient int OneMark;
    private transient int TwoMark;
    private transient int ThreeMark;


    public CompareNumbers(int CHISLO) {

        this.CHISLO = CHISLO;

    }



    @Override
    public void OneThree() {

        if (OneMark > ThreeMark)
            System.out.println("One" + " > " + "Three");
        else
            System.out.println("Three" + " > " + "One");

    }

    @Override
    public void OneTwo() {

        if (OneMark > TwoMark)
            System.out.println("One" + " > " + "Two");
        else
            System.out.println("Two" + " > " + "One");

    }

    @Override
    public void TwoThree() {

        if (TwoMark > ThreeMark)
            System.out.println("Two" + " > " + "Three");
        else
            System.out.println("Three" + " > " + "Two");

    }

    @Override
    public void Split() {

        this.OneMark = CHISLO / 100;

        this.TwoMark = (CHISLO % 100) / 10;

        this.ThreeMark = CHISLO % 10;

    }
}



interface ConcreteCompareNumbers {

    void OneThree();

    void OneTwo();

    void TwoThree();

    void Split();



}
