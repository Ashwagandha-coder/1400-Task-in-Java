package com.Function;

public class Function6 {


    public static void main(String[] args) {

        new Print6().printSymbol6();

    }
}

final class Print6 {

    private final String STRING_1 = "*";
    private final String STRING_2 = " ";

    public void printSymbol6() {

        System.out.println(STRING_1);

        for (int i = 0; i <= 6; i++) {

            System.out.println(STRING_1 + STRING_2.repeat(i) + STRING_1);

        }
        System.out.print(STRING_1.repeat(9));

    }



}
