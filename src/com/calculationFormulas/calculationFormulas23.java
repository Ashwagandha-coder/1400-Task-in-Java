package com.calculationFormulas;

import org.jetbrains.annotations.NotNull;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class calculationFormulas23 {

   // private static double ReturnDouble;

    public static void main(String[] args) {

        Init();


    }
    private static void Init() {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        scanner.close();

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println(Arrays.toString(Calculate(a, b, c, d)));



    }
    private static int @NotNull [] Calculate(int a, int b, int c, int d) {

        int Perimetr = a + b + c + d;
        int Diagonal = (int) (Math.pow(a,2) + Math.pow(d,2));
        Diagonal = (int) Math.pow(Diagonal,2);
        int[] Result = new int[2];
        Result[0] = Perimetr;
        Result[1] = Diagonal;


        return Result;
    }
}
// Task 2.23
