package com.Function;

public class Function5 {

    public static void main(String[] args) {

        new Print5().printSymbol();

    }
}

class Print5 {

    private final String STRING_1 = " ";
    private final String STRING_2 = "*";


    public void printSymbol() {

        System.out.print(STRING_2.repeat(60));
        for (int i = 0; i <= 19; i++) {

            System.out.println(STRING_2 + STRING_1.repeat(59)+ STRING_2);

        }
        System.out.print(STRING_2.repeat(61));
    }

}

// task 14.5