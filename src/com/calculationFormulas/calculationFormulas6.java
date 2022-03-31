package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int EarthRadius = 6350;
        int h = scanner.nextInt();

        int distance = (int) (Math.pow(Math.pow((EarthRadius + h),2) - Math.pow(EarthRadius,2),0.5));

        System.out.println(distance);



    }
}
// Task 2.6
