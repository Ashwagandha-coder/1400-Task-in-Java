package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction14 {

    public static void main(String[] args) {

        CompareValue14 compareValue14 = new CompareValue14();
        compareValue14.CompareValues14();

    }
}

class CompareValue14 extends ScanningValues14 {





    public void CompareValues14() {

        new ScanningValues14();

        if (getU1() / getR1() < getU2() / getR2())
            System.out.println(1);
        else
            System.out.println(2);

       // scanningValues14 = null;


    }


}

class ScanningValues14 {



    private transient final int R1;
    private transient final int R2;
    private transient final int U1;
    private transient final int U2;


    public ScanningValues14() {

        Scanner scanner = new Scanner(System.in);


        this.R1 = scanner.nextInt();
        this.R2 = scanner.nextInt();
        this.U1 = scanner.nextInt();
        this.U2 = scanner.nextInt();


    }

    public int getR1() {
        return R1;
    }

    public int getR2() {
        return R2;
    }

    public int getU1() {
        return U1;
    }

    public int getU2() {
        return U2;
    }

}
