package com.Stringi;

import java.util.Scanner;

public class Stringi18 {


    public static void main(String[] args) {

        SumSymbolLast sumSymbolLast = new SumSymbolLast();

        sumSymbolLast.scannerWordLast();
        sumSymbolLast.sumSymbolWordLast();

    }
}

class SumSymbolLast {

    private String word;

    public void scannerWordLast() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void sumSymbolWordLast() {

        System.out.print(word.charAt(2));
        System.out.print(word.charAt(word.length() - 1));

    }


}
