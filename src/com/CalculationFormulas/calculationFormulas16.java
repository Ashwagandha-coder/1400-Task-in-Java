package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas16 {

    public static void main(String[] args) {


        System.out.println(Init());

    }
    private static int Init() {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = (int) (Math.pow(a,2) + Math.pow(b,2));
        int res = (int) Math.pow(c,2);


        return Perimetr(a,b,res);


    }
    private static int Perimetr(int a, int b, int c) {

        return a + b + c;

    }
}
// Task 2.16
