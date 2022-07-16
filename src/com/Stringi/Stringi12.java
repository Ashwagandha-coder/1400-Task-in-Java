package com.Stringi;

import java.util.Scanner;

public class Stringi12 {


    public static void main(String[] args) {

        LastSymbol lastSymbol = new LastSymbol();

        lastSymbol.scannerWord();
        lastSymbol.printLastSymbol();

    }
}

class LastSymbol {

    private String word;

    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);


        word = scanner.nextLine();
    }

    public void printLastSymbol() {

        System.out.println(word.charAt(word.length() - 1));

    }


}
