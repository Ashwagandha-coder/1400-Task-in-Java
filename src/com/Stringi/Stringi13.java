package com.Stringi;

import java.util.Scanner;

public class Stringi13 {


    public static void main(String[] args) {

        OprSymbol oprSymbol = new OprSymbol();

        oprSymbol.scannerSymbol();
        oprSymbol.printSymbol();

    }
}

class OprSymbol {

    private String word;
    private int k;

    public void scannerSymbol() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();
        k = scanner.nextInt();

    }


    public void printSymbol() {

        System.out.println(word.charAt(k));

    }


}
