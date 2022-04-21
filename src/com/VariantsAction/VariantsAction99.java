package com.VariantsAction;


import java.util.Scanner;

public class VariantsAction99 {


    public static void main(String[] args) {


        ReadNumber99 readNumber99 = new ReadNumber99();
        readNumber99 = null;

        CompareNumbers99 compareNumbers99 = new CompareNumbers99();
        compareNumbers99.CompareNumber99();
    }
}

class ReadNumber99 {

    private transient final double CHISLO_1_;
    private transient final double CHISLO_2_;


    public ReadNumber99() {

        Scanner scanner = new Scanner(System.in);

        this.CHISLO_1_ = scanner.nextDouble();
        this.CHISLO_2_ = scanner.nextDouble();


    }

    public double getCHISLO_1_() {
        return CHISLO_1_;
    }

    public double getCHISLO_2_() {
        return CHISLO_2_;
    }
}


class CompareNumbers99 extends ReadNumber99 {

    public void CompareNumber99() {

        // a)

        if (getCHISLO_1_() > getCHISLO_2_())
            System.out.println(getCHISLO_1_());
        if (getCHISLO_2_() > getCHISLO_1_())
            System.out.println(getCHISLO_2_());

        // b)

        if (getCHISLO_1_() > getCHISLO_2_())
            System.out.println(getCHISLO_1_());


    }



}
