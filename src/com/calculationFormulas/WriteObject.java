package com.calculationFormulas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) throws IOException {

        Person personDan2 = new Person("Dan",1);
        Person personBob2 = new Person("Bob",2);

        FileOutputStream fos = new FileOutputStream("people.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(personDan2);
        oos.writeObject(personBob2);

        oos.close();


    }

}
