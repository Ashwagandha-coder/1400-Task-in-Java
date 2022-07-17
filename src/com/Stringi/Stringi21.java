package com.Stringi;

import java.util.Scanner;

public class Stringi21 {


    public static void main(String[] args) {

        SubString subString = new SubString();

        subString.scannerWord();
        subString.doSome();

    }
}

class SubString {

    private String word;

    private int m;
    private int n;


    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();

        m = scanner.nextInt();
        n = scanner.nextInt();
    }

    public void doSome() {

        System.out.println(word.substring(m,n + 1));


    }

}
