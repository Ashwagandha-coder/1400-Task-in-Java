package com.Stringi;

import java.util.Scanner;

public class Stringi11 {


    public static void main(String[] args) {

        Symbol symbol = new Symbol();

        symbol.scannerWord();
        symbol.printSymbol();

    }
}

class Symbol {

    private String word;

    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void printSymbol() {

        System.out.println(word.charAt(2));


    }

}
