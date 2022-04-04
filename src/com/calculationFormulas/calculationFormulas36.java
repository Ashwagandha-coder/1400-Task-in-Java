package com.calculationFormulas;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class calculationFormulas36 {

    public static void main(String[] args) {

        Temperature temperature = new Temperature();
        temperature.Initialization();

    }
}
class Temperature {


    protected void Initialization() {

        Scanner scanner = new Scanner(System.in);

        int celsie = scanner.nextInt();

        Print(Kelvin(celsie),Farangeit(celsie));

    }
    private double Farangeit(int Celsie) {

        return (Celsie * 1.8) + 32;
    }
    private double Kelvin(int CelsieValue) {

        return CelsieValue + 237.15;
    }

    private void Print(double KelvinValue, double FarengeitValue) {

        String farengeitGrad = "По Фаренгейту :";
        String kelvinGrad = "По Келвину :";

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println(farengeitGrad + " " + FarengeitValue);
        printStream.println(kelvinGrad + " " + KelvinValue);

    }


}