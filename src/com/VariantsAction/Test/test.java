package com.VariantsAction.Test;

public class test {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Test(animal);
        Test(dog);
        Test(cat);

    }
    public static void Test(Animal animal) {
        animal.eat();
    }
}
