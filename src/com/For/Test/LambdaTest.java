package com.For.Test;

import org.jetbrains.annotations.NotNull;

public class LambdaTest {


    public static void main(String[] args) {

        TwoNumbers twoNumbers = (a, b) -> a + b;
        System.out.println(twoNumbers.AsInt(2,3));
    }

    public static int sum(int a, int b, @NotNull TwoNumbers twoNumbers) {

       // int c = twoNumbers.AsInt();
        return a + b;

    }
}

interface TwoNumbers {

    public abstract int AsInt(int a, int b);

}

