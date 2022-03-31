package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int root = (int) (Math.pow(a,2) + 1);

        int function = (int) ((Math.pow(a,2) + 10) / Math.pow(root,0.5));

        System.out.println(function);
    }
}
// Task 2.2
