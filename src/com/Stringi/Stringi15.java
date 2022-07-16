package com.Stringi;

import java.util.Scanner;

public class Stringi15 {


    public static void main(String[] args) {

        CompareLast compareLast = new CompareLast();

        compareLast.scannerSymbolLast();
        compareLast.compareSymbolLast();

    }
}

class CompareLast {

    private String word;

    public void scannerSymbolLast() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void compareSymbolLast() {

        if (word.charAt(0) == word.charAt(word.length() - 1))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
