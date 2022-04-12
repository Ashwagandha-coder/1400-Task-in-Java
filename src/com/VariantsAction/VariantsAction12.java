package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction12 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Comparison comparison = new Comparison(scanner.nextInt(),scanner.nextInt());
        comparison.comparisonSquare(comparison.squareSquare(), comparison.squareCircle());

    }
}

interface Square {

    public double squareCircle();

    public int squareSquare();

    public void comparisonSquare(int square_square, double square_circle);

}



class Comparison implements Square {

    private transient final int RADIUS;
    private transient final int SIDE;

    private transient final double PI = 3.14;


    public Comparison(int RADIUS, int SIDE) {
        this.RADIUS = RADIUS;
        this.SIDE = SIDE;
    }


    @Override
    public double squareCircle() {

        double square_circle = PI * RADIUS;

        return square_circle;


    }

    @Override
    public int squareSquare() {

        int square_square = SIDE * SIDE;

        return square_square;

    }

    @Override
    public void comparisonSquare(int square_square, double square_circle) {

        if (square_square > square_circle)
            System.out.println(square_square + " Square ");
        else
            System.out.println(square_circle + " Circle ");

    }
}
