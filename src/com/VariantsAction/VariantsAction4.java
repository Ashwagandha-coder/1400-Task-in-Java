package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction4 {


    public static void main(String[] args) {

        ifElse ifElse = new ifElse(new Read4());
        ifElse.Compare4();

    }

}

sealed class Read4 permits ifElse  {

    private transient final int CHISLO;

    public Read4() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public int getCHISLO() {
        return CHISLO;
    }
}

non-sealed class ifElse extends Read4 {

    public ifElse(Read4 read4) {}


    public void Compare4() {

        if (getCHISLO() > 4)
            System.out.println("II");
        else
            System.out.println("I");

    }


 }