package com.CalculationFormulas;


import java.util.Scanner;

public class calculationFormulas18 {


    public static void main(String[] args) {

        Init();



    }
    private static void Init() {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(Calculation(x,y));
        System.out.println(ReturnDoubleQ(x,y));


    }
    private static int Calculation(int x, int y) {

        return (int) ((int) (x + (2 + y / Math.pow(x,2))) / y + (1 / Math.pow((Math.pow(x,2) + 10),2)));


    }
    private static double ReturnDoubleQ(int x, int y) {

        return 7.25 * Math.sin(x) - y;

    }
}
// Task 2.18