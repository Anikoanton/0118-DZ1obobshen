package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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
/**
 3. Большая задача:
 a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу
 фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 d. Сделать метод getWeight() который высчитывает вес коробки, зная количество
 фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это
 единицах);
 e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую
 коробку с той, которую подадут в compare в качестве параметра, true - если их веса
 равны, false в противном случае(коробки с яблоками мы можем сравнивать с
 коробками с апельсинами);
 f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
 коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с
 © geekbrains.ru 9
 апельсинами), соответственно в текущей коробке фруктов не остается, а в другую
 перекидываются объекты, которые были в этой коробке;
 g. Не забываем про метод добавления фрукта в коробку.
 */
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox=new Box<Apple>(apple);
        Box<Orange> orangeBox=new Box<Orange>(orange);




        for (int i=1; i<10; i++)
        {
            appleBox.addBox(apple);
            orangeBox.addBox(orange);
        }

       boolean a = appleBox.comparess(orangeBox);

        //box1.addBox(apple2);
        System.out.println("-----------");
	// write your code here
    }
}
