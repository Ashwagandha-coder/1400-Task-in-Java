package com.Stringi;

import com.Arifmetics.Two;

import java.util.Scanner;

public class Stringi16 {


    public static void main(String[] args) {

        TwoWords twoWords = new TwoWords();

        twoWords.scannerTwoWord();
        twoWords.compareTwoWord();

    }
}

class TwoWords {

    private String word_1;
    private String word_2;


    public void scannerTwoWord() {

        Scanner scanner = new Scanner(System.in);

        word_1 = scanner.nextLine();
        word_2 = scanner.nextLine();

    }

    public void compareTwoWord() {

        if (word_1.charAt(0) == word_2.charAt(0))
            System.out.println("YES");
        else
            System.out.println("NO");


    }


}
