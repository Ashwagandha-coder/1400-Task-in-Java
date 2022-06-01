package com.Function;

import java.util.Scanner;

public class Function15 {

    public static void main(String[] args) {

        new ScannerDate();
        PerimetrTrap perimetrTrap = new PerimetrTrap();

        int perimetr1 = perimetrTrap.PaymentPerimetr(perimetrTrap.getTrap1_h1(), perimetrTrap.getTrap1_h2(), perimetrTrap.getTrap1_base1(), perimetrTrap.getTrap1_base2());
        int perimetr2 = perimetrTrap.PaymentPerimetr(perimetrTrap.getTrap2_h1(),perimetrTrap.getTrap2_h2(),perimetrTrap.getTrap2_base1(),perimetrTrap.getTrap2_base2());

        perimetrTrap.SumPrintPerimetr(perimetr1,perimetr2);

        perimetrTrap = null;

    }
}

class ScannerDate {

    private int trap1_h1;
    private int trap1_h2;
    private int trap1_base1;
    private int trap1_base2;

    private int trap2_h1;
    private int trap2_h2;
    private int trap2_base1;
    private int trap2_base2;

    private static final Scanner scanner = new Scanner(System.in);

    public ScannerDate() {


        this.trap1_h1 = scanner.nextInt();
        this.trap1_h2 = scanner.nextInt();
        this.trap1_base1 = scanner.nextInt();
        this.trap1_base2 = scanner.nextInt();

        System.out.println("----");

        this.trap2_h1 = scanner.nextInt();
        this.trap2_h2 = scanner.nextInt();
        this.trap2_base1 = scanner.nextInt();
        this.trap2_base2 = scanner.nextInt();

        System.out.println("++++");

    }


    public int getTrap2_h1() {
        return trap2_h1;
    }

    public int getTrap2_h2() {
        return trap2_h2;
    }

    public int getTrap2_base1() {
        return trap2_base1;
    }

    public int getTrap2_base2() {
        return trap2_base2;
    }

    public int getTrap1_h1() {
        return trap1_h1;
    }

    public int getTrap1_h2() {
        return trap1_h2;
    }

    public int getTrap1_base1() {
        return trap1_base1;
    }

    public int getTrap1_base2() {
        return trap1_base2;
    }

}

class PerimetrTrap extends ScannerDate {

    public int PaymentPerimetr(int h1, int h2, int base1, int base2) { return h1 + h2 + base1 + base2; }

    public void SumPrintPerimetr(int perimetr1, int perimetr2) { System.out.println(perimetr1 + perimetr2); }



}

// task 14.15
