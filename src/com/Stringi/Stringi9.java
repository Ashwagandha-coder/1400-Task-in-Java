package com.Stringi;

public class Stringi9 {


    public static void main(String[] args) {

        new ReferenceVariable().doSome();

    }
}

class ReferenceVariable {

    public void doSome() {

        String country_1 = "Russia";
        String country_2 = "USA";

        String s1;
        String s2;

        s1 = country_1;
        s2 = country_2;

        s1 = s2;
        s2 = s1;

        System.out.println(s1);
        System.out.println(s2);


    }


}
