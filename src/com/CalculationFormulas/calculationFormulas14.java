package com.CalculationFormulas;

import java.util.Scanner;

public class calculationFormulas14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cat1 = scanner.nextInt();
        int cat2 = scanner.nextInt();

        System.out.println(Pifagor(cat1,cat2));
    }
    public static int Pifagor(int cat1,int cat2) {

        int Pifagor = (int) (Math.pow(cat1,2) + Math.pow(cat2,2));


        return (int) Math.pow(Pifagor,2);
    }
}
// Task 2.14
