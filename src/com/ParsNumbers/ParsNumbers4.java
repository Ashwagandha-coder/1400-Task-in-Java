package com.ParsNumbers;

import java.util.Scanner;

public class ParsNumbers4 {


    public static void main(String[] args) {

        new FirstNumberForCheckValue();

    }
}

class FirstNumberForCheckValue {

    private final CheckValue4 checkValue4 = () -> {

        for (double i = 1; i <= 10; i++) {

            if (1 / i < this.value)
                System.out.println(1 / i);
            break;

        }

    };


    private double value;

    public FirstNumberForCheckValue() {

        Scanner scanner = new Scanner(System.in);

        this.value = scanner.nextDouble();

        checkValue4.checkValueFirst();


    }

}

@FunctionalInterface
interface CheckValue4 {


    void checkValueFirst();


}
