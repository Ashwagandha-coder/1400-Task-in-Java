package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction32 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PayMentNumber payMentNumber = new PayMentNumber(scanner.nextInt());
        payMentNumber.NumberPow2();
        payMentNumber.NumberPowSum3();
        payMentNumber.CompareNumber();

    }
}
class PayMentNumber implements NumberPow {

    private transient final int CHISLO;

    private transient int NumberTwo;
    private transient int NumberSumThree;

    public PayMentNumber(int CHISLO) {
        this.CHISLO = CHISLO;
    }


    @Override
    public void NumberPow2() {

        this.NumberTwo = (int) Math.pow(CHISLO, 2);

    }

    @Override
    public void NumberPowSum3() {

        this.NumberSumThree = (int) (Math.pow(CHISLO % 10, 3) + Math.pow((CHISLO % 100) / 10, 3) + Math.pow(CHISLO / 100, 3));

    }

    @Override
    public void CompareNumber() {

        if (NumberTwo == NumberSumThree)
            System.out.println(" Yes ");
        else
            System.out.println(" No ");


    }
}
