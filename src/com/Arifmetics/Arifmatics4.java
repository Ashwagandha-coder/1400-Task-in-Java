package com.Arifmetics;

import java.util.Scanner;

public class Arifmatics4 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        new Apple().DelenieApple(scanner.nextInt(), scanner.nextInt());

    }
}

class Apple {

    public void DelenieApple(int N, int k) {

        int result = k / N;
        int backet = k % N;

        System.out.println(result);
        System.out.println(backet);


    }


}

// task 3.4