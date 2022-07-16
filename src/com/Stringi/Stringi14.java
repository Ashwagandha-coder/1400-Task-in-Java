package com.Stringi;

import java.util.Scanner;

public class Stringi14 {


    public static void main(String[] args) {

       Compare compare = new Compare();

       compare.scannerSymbol();
       compare.compareSymbol();

    }
}

class Compare {

    private String word;

    public void scannerSymbol() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

    }

    public void compareSymbol() {

        if (word.charAt(1) == word.charAt(3))
            System.out.println("YES");
        else
            System.out.println("NO");


    }

}
