package com.Function;

public class Function3 {


    public static void main(String[] args) {

        new Print3().printSymbol();

    }
}

final class Print3 {
    private final String string = "* ";
    public void printSymbol() {

        int i = 1;

        while (i <= 11) {


            System.out.println(string.repeat(i));
            System.out.println();
            i += 1;

        }

    }

}

// task 14.3
