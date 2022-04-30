package com.CalculationFormulas;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class calculationFormulas32 {


    public static void main(String[] args) {

        CalculationPayment calculationPayment = new CalculationPayment();
        calculationPayment.Inited();



    }

}


class CalculationPayment {

    private int N;


    protected void Inited() {

        Scanner scanner = new Scanner(System.in);

        int monitor = scanner.nextInt();
        int mouse = scanner.nextInt();
        int keyboard = scanner.nextInt();
        int system_unit = scanner.nextInt();

        this.N = scanner.nextInt();


        Print(Payment(monitor, mouse, keyboard, system_unit));
    }

    @Contract(pure = true)
    private int @NotNull [] Payment(int monitor, int mouse, int keyboard, int system_unit) {

        final int Sum = (monitor + mouse + keyboard + system_unit) * 3;

        final int SumN = (monitor + mouse + keyboard + system_unit) * N;

        final int[] ResultZ = new int[2];
        ResultZ[0] = Sum;
        ResultZ[1] = SumN;

        return ResultZ;

    }

    private void Print(int @NotNull [] ResultZ) {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println("3 Компьютера:" + " " + ResultZ[0]);
        printStream.println("N Компьютеров" + " " + ResultZ[1]);




    }

}
