package com.For;

public class For4 {

    public static void main(String[] args) {

//        Byte byteRaw = new Byte((byte) 1);
//        Character character = new Character();
//        Integer integer = new Integer();
//        String string_d = new String();
//        Float float_e = new Float();
//        Double double_q = new Double();

        new PrintNumber4().doSome();

    }
}

final class PrintNumber4 {

    MethodsPrint4 methodsPrint4 = () -> {
        for (int i = 10; i <= 25; i++) {
            System.out.print(i + " " + ((double) i + 0.4));
            System.out.println();
        }
        System.out.println();
        for (int j = 25; j <= 35; j++) {
            System.out.print(j + " " + ((double) j + 0.5) + " " + ((double) j - 0.2));
            System.out.println();
        }

    };

    public void doSome() { methodsPrint4.MethodprintNumbers4(); }

}

interface MethodsPrint4 {

    void MethodprintNumbers4();

}

// task 5.4