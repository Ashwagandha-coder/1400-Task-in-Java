package com.Type;

import org.jetbrains.annotations.NotNull;

public class Type {

    public static void main(String[] args) {

        Init();

    }
    public static void Init() {

        String[] SurName = new String[] {"I","P","S","G","M","U","A","V","R","F","L","O","T","Z","Q","D","C","W","B","j","Y","X","H","N","<"};
        String[] name = new String[] {"I","P","S","G","M","U","A","V","R","F","L","O","T","Z","Q","D","C","W","B","j","Y","X","H","N","<"};

        PrintName(name,SurName);
    }
    public static void PrintName(String @NotNull [] name, String[] SurName) {

        for (int i = 0; i <= name.length - 1; i++) {
            System.out.println(name[i] + " " + SurName[i]);
        }

    }
}
// Task 13.1
