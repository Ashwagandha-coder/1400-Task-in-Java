package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas38 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MathCalculate mathCalculate = new MathCalculate(scanner.nextInt(), scanner.nextInt());
        mathCalculate.Sum();

    }

}
class MathCalculate {

    private transient final double firstValue;
    private transient final double secondValue;

    private transient double minus;
    private transient double sum;
    private transient double multiplication;
    private transient double division;
    private transient double average;

    public MathCalculate(int firstValue, int secondValue) {

        this.firstValue = firstValue;
        this.secondValue = secondValue;

    }

    public void Sum() {

        this.sum = this.firstValue + this.secondValue;

        Multiplication();
    }
    public void Multiplication() {

        this.multiplication = this.firstValue * this.secondValue;

        Division();
    }
    public void Division() {

        this.division = this.firstValue / this.secondValue;

        Minus();
    }
    public void Minus() {

        this.minus = this.firstValue - this.secondValue;

        Average();
    }
    public void Average() {

        this.average = (this.firstValue + this.secondValue) / 2;

        PrintValue(this.average,this.minus,this.division,this.multiplication,this.sum);
    }
    public void PrintValue(double average, double minus,double division, double multiplication,double sum) {

        System.out.print(this.firstValue + " + " + this.secondValue + " = " + sum + " ");
        System.out.print(this.firstValue + " - " + this.secondValue + " = " + minus + " ");
        System.out.print(this.firstValue + " * " + this.secondValue + " = " + multiplication + " ");
        System.out.print(this.firstValue + " / " + this.secondValue + " = " + division + " ");
        System.out.print(this.firstValue + " + " + this.secondValue + " = " + average);


    }

}
