package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction3 {

    public static void main(String[] args) {

        Trigonometry3 trigonometry3 = new Trigonometry3();

        trigonometry3.CompareMethod();

    }
}




class Trigonometry3 implements payMent3 {

    private transient final int CHISLO;


    public Trigonometry3() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO = scanner.nextInt();

    }

    public int getCHISLO() {
        return CHISLO;
    }

    public void CompareMethod() {

        if (getCHISLO() > 0)
            doSome1();
        else
            doSome2();


    }


    @Override
    public void doSome1() { System.out.println(Math.sin(Math.pow(getCHISLO(), 2))); }

    @Override
    public void doSome2() { System.out.println(1 + (2 * Math.sin(getCHISLO()) * Math.sin(getCHISLO()))); }
}



interface payMent3 {

    void doSome1();

    void doSome2();


}
