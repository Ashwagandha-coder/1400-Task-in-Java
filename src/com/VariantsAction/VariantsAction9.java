package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction9 {


    public static void main(String[] args) {

        Read9 read9 = new Read9();
        read9.MaxMinValue();

    }
}

final class Read9 implements MaxMin {

    @Override
    public void MaxMinValue() {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));


    }
}

sealed interface MaxMin permits Read9 {

    void MaxMinValue();

}
