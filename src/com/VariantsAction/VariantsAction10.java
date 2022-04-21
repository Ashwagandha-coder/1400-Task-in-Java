package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction10 {


    public static void main(String[] args) {

        PrintValue10 printValue10 = new PrintValue10();
        printValue10.CompareDistance();

    }
}

final class Read10 implements ReadInfo10 {

    private transient int DISTANCE_KM;
    private transient int DISTANCE_FT;

    @Override
    public void ReadInfoDistance() {

        Scanner scanner = new Scanner(System.in);

        this.DISTANCE_KM = scanner.nextInt();
        this.DISTANCE_FT = scanner.nextInt();
    }

    public int getDISTANCE_KM() {
        return DISTANCE_KM;
    }

    public int getDISTANCE_FT() {
        return DISTANCE_FT;
    }
}

non-sealed class PrintValue10 implements CompareMin10 {


    @Override
    public void CompareDistance() {

        Read10 read10 = new Read10();
        read10.ReadInfoDistance();

        int a = read10.getDISTANCE_KM() * 1000;
        int b = (int) (read10.getDISTANCE_FT() * 0.3048);

        if (a > b)
            System.out.println(read10.getDISTANCE_KM());
        else
            System.out.println(read10.getDISTANCE_FT());
    }

}

sealed  interface CompareMin10 permits PrintValue10 {

    void CompareDistance();


}

sealed interface ReadInfo10 permits Read10 {

    void ReadInfoDistance();


}
