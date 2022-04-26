package com.For.Test;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GenericsTest {

    public static void main(String[] args) {

        int b = 0;
        char d;

        List list = new ArrayList();

        List list1 = new Stack();

        Ruka<Integer> ruka = (a) -> a*a;

        Ruka<Integer> rukaA = new Bed();

        Ruka<String> rukaB = new Well();

        List<Animal> listofAnimals = new ArrayList<>();

        listofAnimals.add(new Animal(1));
        listofAnimals.add(new Animal(2));
        listofAnimals.add(new Animal(3));

        List<Dog> listofDog = new ArrayList<>();

        listofDog.add(new Dog(7));
        listofDog.add(new Dog(8));
        listofDog.add(new Dog(9));

        test(listofAnimals);
        test(listofDog);


    }

    private static void test(@NotNull List<? extends Animal> list) {

        for (Animal animal: list)
            System.out.println(animal.getId());

    }
}
@FunctionalInterface
interface Ruka<romb> {

    int abc(romb t);


}

class Bed implements Ruka {
    @Override
    public int abc(Object o) {
        return 0;
    }
}

class Well implements Ruka {
    @Override
    public int abc(Object o) {
        return 1;
    }
}

class Animal {

    private transient int id;

    public Animal() {}

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {

        System.out.println("Animal eating");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}

class Dog extends Animal {

    private transient int id;

    public Dog(int id) {
        this.id = id;
    }
}

/*
class Opa implements Ruka {

int abc() {
return a;
}
}



Opa opa = new Opa();




class Tort implements List {

.....
}

Tort tort = new Tort();
tort.METHOD....


 */

