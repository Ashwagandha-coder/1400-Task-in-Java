package com.Stringi;

public class Stringi10 {


    public static void main(String[] args) {

        new ReferenceValue().doSome3();

    }
}

class ReferenceValue {

    public void doSome3() {

        String a = "qu";
        String b = "qc";
        String c = "du";

        b = c;
        a = b;
        c = a;

        b = a;
        c = b;
        a = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }


}