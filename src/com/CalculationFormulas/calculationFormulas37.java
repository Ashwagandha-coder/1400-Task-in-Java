package com.CalculationFormulas;

public class calculationFormulas37 {

    public static void main(String[] args) {


        CelsieCalculate celsieCalculate = new CelsieCalculate(450);
        celsieCalculate.PaymentCelsie();


    }

}
class CelsieCalculate {

    private transient double gradFarengeit;

    public CelsieCalculate(int gradFarengeit) {

        this.gradFarengeit = gradFarengeit;

    }

    public void PaymentCelsie() {

        double ResultGradCelsie = 0.555555 * (this.gradFarengeit - 32);

        System.out.println("Grad Celsie:" + " " + ResultGradCelsie);

    }

}
