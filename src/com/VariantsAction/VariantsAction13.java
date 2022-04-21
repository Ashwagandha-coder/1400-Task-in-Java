package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction13 {

    public static void main(String[] args) {

        WriteValues13 writeValues13 = new WriteValues13();
        writeValues13.PayMentValue13();
        writeValues13.PrintValue13();

    }
}

class ReadValues13 {

    private transient final int V1;
    private transient final int V2;
    private transient final int M1;
    private transient final int M2;

    public ReadValues13() {

        Scanner scanner = new Scanner(System.in);

        this.V1 = scanner.nextInt();
        this.V2 = scanner.nextInt();
        this.M1 = scanner.nextInt();
        this.M2 = scanner.nextInt();

    }

    public int getV1() {
        return V1;
    }

    public int getV2() {
        return V2;
    }

    public int getM1() {
        return M1;
    }

    public int getM2() {
        return M2;
    }
}

non-sealed class WriteValues13 implements Plotnost {

    private transient int P1;
    private transient int P2;

    @Override
    public void PayMentValue13() {

        ReadValues13 readValues13 = new ReadValues13();

        this.P1 = readValues13.getM1() / readValues13.getV1();
        this.P2 = readValues13.getM2() / readValues13.getV2();

    }

    @Override
    public void PrintValue13() {

        if (P1 > P2)
            System.out.println(1);
        else
            System.out.println(2);

    }
}



sealed interface Plotnost permits WriteValues13 {

    void PayMentValue13();

    void PrintValue13();

}
