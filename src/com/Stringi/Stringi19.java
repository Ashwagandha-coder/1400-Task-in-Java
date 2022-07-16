package com.Stringi;

import java.util.Scanner;

public class Stringi19 {


    public static void main(String[] args) {

        ThreeSymbol threeSymbol = new ThreeSymbol();

        threeSymbol.scannerWord();
        threeSymbol.sumSymbolWord();

    }
}

class ThreeSymbol {

    private String word;

    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void sumSymbolWord() {

        System.out.print(word.charAt(1));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(3));

    }


}
