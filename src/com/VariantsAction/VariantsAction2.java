package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction2 {

    public static void main(String[] args) {


        SubClassTrigonometry subClassTrigonometry = new SubClassTrigonometry();

        subClassTrigonometry.ActionCompare();


    }
}

abstract class Trigonometry {

    private transient int Chislo;

    public void ReadNumbers2() {

        Scanner scanner = new Scanner(System.in);

        this.Chislo = scanner.nextInt();

    }

    public int getChislo() {
        return Chislo;
    }
}

class SubClassTrigonometry extends Trigonometry implements payMent2 {

    public SubClassTrigonometry() {}


    @Override
    public void OneVariants() {

        System.out.println(Math.sin(getChislo()) * Math.sin(getChislo()));

    }

    @Override
    public void TwoVariants() {

        System.out.println(1 - (Math.sin(Math.pow(getChislo(), 2))));

    }

    public void ActionCompare() {

        ReadNumbers2();

        if (getChislo() > 0)
            OneVariants();
        else
            TwoVariants();


    }


}


interface payMent2 {

    void OneVariants();

    void TwoVariants();


}