package com.Function;


public class Function2 {


    public static void main(String[] args) {

        new Print2().doSome();

    }
}

final class Print2 {


    public void doSome() { printSymbol.printSymbolSome(); }

    PrintSymbol printSymbol = () -> {

        String string = "+";
        for (int i = 0; i <= 9; i++)
            System.out.print(string);

    };

}

@FunctionalInterface
interface PrintSymbol {

    void printSymbolSome();

}

// task 14.2
