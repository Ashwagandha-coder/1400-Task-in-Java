package com.For.Test;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GenericsTest {

    public static void main(String[] args) {

        List list = new ArrayList();

        List list1 = new Stack();

        Ruka<Integer> ruka = (a) -> a*a;

        Ruka<Integer> rukaA = new Bed();


    }
}
@FunctionalInterface
interface Ruka<T> {

    int abc(T t);


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

