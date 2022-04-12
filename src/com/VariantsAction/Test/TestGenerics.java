package com.VariantsAction.Test;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class TestGenerics {

    public static void main(String[] args) {

        ArrayList<String> yeti = new ArrayList<>();

        yeti.add("python");
        yeti.add("java");
        yeti.add("scala");
        yeti.add("ruby");
        yeti.add("kotlin");
        yeti.add("c++");
        yeti.add("groovy");
        yeti.add("java_script");

        TestGenerics testGenerics = new TestGenerics();
        testGenerics.testCar(yeti);

    }
    public void testCar(@NotNull ArrayList<? extends Object> arrayList) {

        for (Object car: arrayList) {
            System.out.println(car);
        }



    }
}
class Car {



    public void Rrrr() {
        System.out.println("It is Car");
    }



}
class Toyota extends Car {



    @Override
    public void Rrrr() {
        System.out.println("It is Toyota");
    }



}

class Bmw extends Car {





}

