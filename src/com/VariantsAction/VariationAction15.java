package com.VariantsAction;

import java.util.Scanner;

public class VariationAction15 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Quadro quadro = new Quadro(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        quadro.payMent();

        scanner.close();

    }
}
class Quadro implements Ure {

    private transient final int A;
    private transient final int B;
    private transient final int C;

    public Quadro(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public void payMent() {

        int discriminant = (int) (Math.pow(B,2) - 4 * A * C);

        if (discriminant > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}

interface Ure {

    public void payMent();

}
