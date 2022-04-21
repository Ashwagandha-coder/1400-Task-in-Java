package com.For;

import java.util.Scanner;

public class For67 {


    public static void main(String[] args) {

        Pow pow = new Pow();
        pow.PowNumber67();

    }
}

class Pow {

    private transient int CHISLO;

    public Pow() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public void PowNumber67() {

        this.CHISLO = (int) Math.pow(CHISLO, 3);
        System.out.println(CHISLO);


    }



}

