package com.Stringi;

import java.util.Scanner;

public class Stringi17 {


    public static void main(String[] args) {

        SumSymbol symbol = new SumSymbol();

        symbol.scannerWord();
        symbol.sumSymbolWord();

    }
}

class SumSymbol {

    private String word;

    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void sumSymbolWord() {

        System.out.print(word.charAt(1));
        System.out.print(word.charAt(3));

    }


}
