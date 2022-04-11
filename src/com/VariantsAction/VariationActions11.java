package com.VariantsAction;

import java.util.Scanner;

public class VariationActions11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Speed speed = new Speed(scanner.nextDouble(),scanner.nextDouble());

        System.out.println(speed.Var());

    }
}
class Speed {

    private transient final double kmh;
    private transient final double ms;

    private transient final double CONST = 0.28;

    public Speed(double kmh, double ms) {
        this.kmh = kmh;
        this.ms = ms;
    }


    public double Var() {

        double Result = this.kmh * CONST;

        return Math.max(Result, this.ms);

    }
}
