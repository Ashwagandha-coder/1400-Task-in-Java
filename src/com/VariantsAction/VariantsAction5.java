package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction5 {


    public static void main(String[] args) {

        ifElse5 ifElse5 = new ifElse5(new Read5());
        ifElse5.Compare5();

    }
}
sealed class Read5 permits ifElse5 {

    private transient final int CHISLO;

    public Read5() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public int getCHISLO() {
        return CHISLO;
    }
}


final class ifElse5 extends Read5 {

    public ifElse5(Read5 read5) {}

    public void Compare5() {

        if (getCHISLO() > 3)
            System.out.println("I");
        else
            System.out.println("II");

    }


}
