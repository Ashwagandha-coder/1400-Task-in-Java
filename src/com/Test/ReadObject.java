package com.Test;

import com.Test.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Person personZak = new Person("Zak",3);
        //Person personPasha = new Person("Pasha",4);

        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person personDan = (Person) ois.readObject();
        Person personBob = (Person) ois.readObject();

        System.out.println(personDan);
        System.out.println(personBob);

        ois.close();

    }

}
