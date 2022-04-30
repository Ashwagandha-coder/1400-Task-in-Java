package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas25<lateinit> {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Square square = new Square<>(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        square.SquarePar();
        square.PrintValue();



    }
}

