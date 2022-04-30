package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas17 {

    public static void main(String[] args) {

        System.out.println(Init());


    }
    private static int Init() {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        return Perimetr(a,b,h);

    }
    private static int Perimetr(int a, int b, int h) {

        int Catet = (b - a) / 2;
        int Gipotenusa = (int) (Math.pow(h,2) + Math.pow(Catet,2));
        Gipotenusa = (int) Math.pow(Gipotenusa,2);

        return a + b + (Gipotenusa * 2);

    }
}
