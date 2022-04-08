package com.calculationFormulas;

import java.util.Scanner;

public class calculationFormulas31 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PayMentFood payMentFood = new PayMentFood(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        payMentFood.PayMentApple();
        payMentFood.PayMentCockie();
        payMentFood.PayMentSweet();
        payMentFood.Purchases();


    }
}
class PayMentFood implements PayMentTasty {

    // price food

    private transient final int applePrice;
    private transient final int cookiePrice;
    private transient final int sweetPrice;

    // count food kilograms

    private transient final int x;
    private transient final int y;
    private transient final int z;

    // sum food

    private transient int sumApple;
    private transient int sumCoockie;
    private transient int sumSweet;



    public PayMentFood(int applePrice, int cookiePrice, int sweetPrice, int x, int y, int z) {

        this.applePrice = applePrice;
        this.cookiePrice = cookiePrice;
        this.sweetPrice = sweetPrice;

        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Override methods from interface PayMentTasty


    @Override
    public void PayMentCockie() {

        this.sumCoockie = y * cookiePrice;

    }

    @Override
    public void PayMentApple() {

        this.sumApple = x * applePrice;

    }

    @Override
    public void PayMentSweet() {

        this.sumSweet = z * sweetPrice;

    }

    @Override
    public void Purchases() {

        int purchase = sumCoockie + sumApple + sumSweet;

        System.out.println(purchase);

    }


}
