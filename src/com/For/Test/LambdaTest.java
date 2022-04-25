package com.For.Test;

import org.jetbrains.annotations.NotNull;

import java.util.function.*;

public class LambdaTest {


    public static void main(String[] args) {

        //TwoNumbers twoNumbers = (a, b) -> a + b;
        sum(2,2,() -> System.out.println("a" + "b"));



        Predicate<Integer> predicate = (t) -> t%2 == 0;
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        Function<Integer,String> function = (x) -> String.valueOf(x);
        //Supplier<TwoNumbers> supplier;
        UnaryOperator<Integer> unaryOperator = (x) -> x*x;
        BinaryOperator<Integer> binaryOperator = (x, y) -> x*y;



    }

    public static void sum(int a, int b, @NotNull TwoNumbers twoNumbers) {


        twoNumbers.AsInt();

    }
}
@FunctionalInterface
interface TwoNumbers {

    public abstract void AsInt();

}

