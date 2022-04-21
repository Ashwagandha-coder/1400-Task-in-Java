package com.VariantsAction.Test2;

public class Dog extends Animal2 {

    public void bark2() {
        System.out.println("Bark Bark");
    }
    public void KormEat() {
        System.out.println("I am Dog I eat Korm");
    }

    @Override
    public void toSay() {
        System.out.println("I am Dog");
    }
}
