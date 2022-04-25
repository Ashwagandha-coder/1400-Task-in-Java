package com.For.Test;

import org.jetbrains.annotations.NotNull;

public class LambdaTest {


    public static void main(String[] args) {


        System.out.println(sum(2,2, (a, b) -> a + b));

    }

    public static int sum(int a, int b, @NotNull TwoNumbers twoNumbers) {

        return a + b;

    }
}

interface TwoNumbers {

    public abstract int AsInt(int a, int b);

}

