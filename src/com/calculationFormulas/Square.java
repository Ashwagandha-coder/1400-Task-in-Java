package com.calculationFormulas;

public class Square<squareValue> extends V {

    @Override
    public void Volume() {
        super.Volume();
    }

    private transient int squareValue;



    public Square(int a, int b, int c) {
        super(a,b,c);
    }

    public void SquarePar() {

        this.squareValue = getA() * getB();

    }
    public void PrintValue() {

        System.out.println(this.squareValue);
        System.out.println(getVolume());

    }
}
