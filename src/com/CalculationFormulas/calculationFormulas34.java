package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas34 {

    public static void main(String[] args) {

        Time time = new Time();

    }

}
class Time {

    protected int Velocity1;
    protected int Velocity2;
    protected double Distance;
    protected double time;


    // constructor
    public Time() {
        Scanner scanner = new Scanner(System.in);

        this.Velocity1 = scanner.nextInt();
        this.Velocity2 = scanner.nextInt();
        this.Distance = scanner.nextDouble();

        TimeCalculation(Velocity1,Velocity2);
        Print();
    }

    protected void TimeCalculation(int Velocity1, int Velocity2) {

        this.time = Distance / (Velocity1 + Velocity2);

    }
    protected void Print() {

         double timePrint = this.time;

        System.out.println(timePrint);

    }


}
