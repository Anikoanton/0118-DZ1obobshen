package com.company;

import java.util.ArrayList;

/**
 * Created by Антон on 03.02.2018.
 */
public class Box <T extends Fruit> {

    private T obj;

    public Box() { }

    private ArrayList box=new ArrayList();

    public void addBox(T ob)
    {
        box.add(ob);

    }
}
