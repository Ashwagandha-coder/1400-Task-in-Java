package com.Test;

import com.Test.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) throws IOException {

        Person personDan = new Person("Dan",1);
        Person personBob = new Person("Bob",2);

        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(personDan);
        oos.writeObject(personBob);

        oos.close();


    }

}
