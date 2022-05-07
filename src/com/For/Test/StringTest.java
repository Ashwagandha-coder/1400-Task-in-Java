package com.For.Test;

public class StringTest {

    public static void main(String[] args) {

        String string = "abc";
        String string1 = new String("cde");
        string1.toUpperCase();
        System.out.println(string1.toString());

        StringBuilder stringBuilder = new StringBuilder("Poroh");
        stringBuilder.append(" in").append(" gun");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer();

    }
}
