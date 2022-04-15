package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction18 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Size size = new Size(scanner.nextInt(), scanner.nextInt());

        size.RadiusCircle();
        size.SideSquare();
        size.CircleInSquare();
        size.SquareInCircle();

    }
}
class Size implements SizeCircleSquare {

    private transient final double CIRCLE_S;
    private transient final double SQUARE_S;

    private transient double Radius_Circle;
    private transient double Side_Square;
   // private transient int Radius_Circle;

    public Size(int CIRCLE, int SQUARE) {
        this.CIRCLE_S = CIRCLE;
        this.SQUARE_S = SQUARE;
    }


    @Override
    public void RadiusCircle() {

        double PI = 3.14;
        this.Radius_Circle = Math.pow((this.CIRCLE_S / PI), 0.5);

    }

    @Override
    public void SideSquare() {

        this.Side_Square = Math.pow(this.SQUARE_S, 0.5);

    }

    @Override
    public void SquareInCircle() {

        if ((Math.pow((this.Radius_Circle), 2)) >= 2 * Math.pow(this.Side_Square, 2))
            System.out.println(" Yes " + " SquareInCircle");
        else
            System.out.println(" No " + " SquareInCircle");

    }

    @Override
    public void CircleInSquare() {

        if (this.Radius_Circle <= this.Side_Square / 2)
            System.out.println("Yes" + " CircleInSquare");
        else
            System.out.println(" No " + " CircleInSquare");

    }
}
