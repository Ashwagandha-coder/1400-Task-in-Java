package com.calculationFormulas;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class calculationFormulas24 {

    public static void main(String[] args) {


        Init();


    }
    private static void Init() {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(Arrays.toString(Calculate(first,second)));



    }
    @Contract(pure = true)
    private static int @NotNull [] Calculate(int first, int second) {

        int sum = first + second;
        int raznost = first - second;
        int proizedenie = first * second;
        int delenie = first / second;
        int chastnoe = first % second;

        int[] Result = new int[5];
        Result[0] = sum;
        Result[1] = raznost;
        Result[2] = proizedenie;
        Result[3] = delenie;
        Result[4] = chastnoe;

        return Result;

    }
}
// Task 2.24
