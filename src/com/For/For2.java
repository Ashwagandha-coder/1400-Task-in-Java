package com.For;

public class For2 {

    public static void main(String[] args) {

        new PrintNumber100().PrintChislo();

    }
}

class PrintNumber100  {

   // private transient final byte A = 100;

    Print print = a -> {
        for (int i = 0; i <= 19; i++)
            System.out.print(a + " "); };

    public void PrintChislo() {

        print.printNumbers2((byte) 100);
    }
}

interface Print {

    void printNumbers2(byte a);


}

// task 5.2