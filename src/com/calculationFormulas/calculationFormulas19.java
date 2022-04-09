package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas19 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        CalculationXY calculationXY = new CalculationXY(scanner.nextInt(), scanner.nextInt());
        calculationXY.calcX();
        calculationXY.calcY();
        calculationXY.printValueCalc();


    }
}
class CalculationXY implements calcXY, printValue {

    private transient double X;
    private transient double Y;

    private transient final double a;
    private transient final double b;




    public CalculationXY(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void calcX() {

        this.X = (2 / Math.pow(a,2) + 25) / (Math.pow(b,0.5) + (a + b / 2));

    }

    @Override
    public void calcY() {

        this.Y = a + 2 * Math.sin(b) / 5.5 * a;

    }

    @Override
    public void printValueCalc() {

        System.out.println(X);
        System.out.println(Y);

    }
}
