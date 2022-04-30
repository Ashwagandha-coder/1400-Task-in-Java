package com.Serealization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadPupils {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadObjectMassive();

    }
    public static void ReadObjectMassive() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("pupils_2.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Pupils[] pupilsReadObject = (Pupils[]) objectInputStream.readObject();

        System.out.println(Arrays.toString(pupilsReadObject));
    }

}
// Test Serealizable Massive via add object massive in file pupils_2.bin
// And read object massive from file and println in console
