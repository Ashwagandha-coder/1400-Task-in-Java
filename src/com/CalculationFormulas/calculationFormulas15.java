package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int InnerRadius = scanner.nextInt();
        int ExternalRadius = scanner.nextInt();

        System.out.println(Square(InnerRadius,ExternalRadius));

    }
    public static int Square(int InnerRadius, int ExternalRadius) {

        double pi = 3.14;
        int raznitsa = ExternalRadius - InnerRadius;

        int edge = (int) (Math.pow(raznitsa, 2) * pi);

        int hole = (int) (Math.pow(ExternalRadius, 2) * pi);

        return edge + hole;
    }
}
// Task 2.15
