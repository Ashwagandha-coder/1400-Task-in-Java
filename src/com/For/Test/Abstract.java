package com.For.Test;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Abstract {

    public static void main(String[] args) {

        new Love();

    }
}
class Love implements LoveAnimals {

    public Love() {
        LoveCat();
        LoveSpider();
    }


    @Override
    public void LoveCat() {
        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);
        printStream.println("Ты любишь тигров на(в) " + Math.random() + "%");
    }

    @Override
    public void LoveSpider() {
        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);
        printStream.println("Ты любишь собак на(в) " + Math.random() + "%");
    }
}

interface LoveAnimals {

    void LoveCat();

    void LoveSpider();

}
