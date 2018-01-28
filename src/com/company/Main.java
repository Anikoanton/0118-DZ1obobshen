package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] inums  = { 1 , 2 , 3 , 4 , 5 };

        Mas<Integer> mas1 = new Mas<Integer>(inums);
        // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        mas1.changeEllement(0,3);
        // 2. Написать метод, который преобразует массив в ArrayList;
        ArrayList array =  mas1.transformMass();
        String[] str  = { "a" , "b" , "c" , "d" , "e" };
        Mas<String> mas2 = new Mas<String>(str);
        mas2.changeEllement(1,2);

        System.out.println("-----------");
        System.out.println("-----------");
    }
}
