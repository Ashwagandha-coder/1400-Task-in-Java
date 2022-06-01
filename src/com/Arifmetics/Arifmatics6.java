package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics6 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       new Cupe().doSome(scanner.nextInt());

    }
}

class Cupe {

    public void doSome(double x) {

        int SIZE_CUPE = 4;
        if ((x / SIZE_CUPE) * 100 % 100 >= 75 || (x / SIZE_CUPE) * 100 % 100 >= 5.0)
            System.out.println((int) x / SIZE_CUPE + 1);
        else
            System.out.println(x / SIZE_CUPE);

    }


}

// task 3.6