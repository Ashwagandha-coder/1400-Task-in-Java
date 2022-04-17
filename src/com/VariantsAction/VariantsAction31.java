package com.VariantsAction;

public class VariantsAction31 {

    public static void main(String[] args) {



    }
}
class CompareNumbers implements ConcreteCompareNumbers {

    private transient final int CHISLO;

    private transient int OneMark;
    private transient int TwoMark;
    private transient int ThreeMark;


    public CompareNumbers(int CHISLO, int oneMark, int twoMark, int threeMark) {

        this.CHISLO = CHISLO;
        OneMark = oneMark;
        TwoMark = twoMark;
        ThreeMark = threeMark;
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
        else System.out.println("Two" + " > " + "One");

    }

    @Override
    public void TwoThree() {

        if

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
