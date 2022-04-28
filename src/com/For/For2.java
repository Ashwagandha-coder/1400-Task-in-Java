package com.For;

public class For2 {

    public static void main(String[] args) {

        new PrintNumber100().PrintOneChislo();

    }
}

class PrintNumber100  {


    Print print = u -> {
        for (int i = 0; i <= 19; i++)
            System.out.print(u + " "); };

    public void PrintOneChislo() {

        print.printNumbers2((byte) 100);
    }
}

@FunctionalInterface
interface Print {

    void printNumbers2(byte a);


}

// task 5.2