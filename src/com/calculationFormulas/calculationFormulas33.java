package com.calculationFormulas;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;


public class calculationFormulas33 {

    public static void main(String[] args) {

        calculationFormulas33 result = new calculationFormulas33();
        result.Init();

    }
    private void Init() {

        Scanner scanner = new Scanner(System.in);

        int AgeX = scanner.nextInt();
        int AgeY = scanner.nextInt();

        Print(Difference(AgeX,AgeY,AverageAge(AgeX,AgeY)),AverageAge(AgeX,AgeY));

    }
    private int AverageAge(int AgeX, int AgeY) {

        int Average = AgeX + AgeY;
        Average = Average / 2;

        return Average;

    }
    @Contract(pure = true)
    private int @NotNull [] Difference(int AgeX, int AgeY, int Average) {

        int DifferenceAgeX = Average - AgeX;
        int DifferenceAgeY = Average - AgeY;

        int[] Difference = new int[2];
        Difference[0] = DifferenceAgeX;
        Difference[1] = DifferenceAgeY;

        return Difference;

    }
    private void Print(int[] Difference, int AverageAge) {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println("Средний возраст Тани и Мити :" + " " + AverageAge);
        printStream.println("Возраст Тани и Мити отличается на :" + " " + Arrays.toString(Difference));

    }

}

