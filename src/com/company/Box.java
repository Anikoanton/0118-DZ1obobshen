package com.company;

import java.util.ArrayList;

/**
 * Created by Антон on 03.02.2018.
 */
public class Box <T extends Fruit> {

    protected T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public Box() { }

    private ArrayList box=new ArrayList();

    public void addBox(T ob)
    {
        box.add(ob);

    }

    public  boolean comparess(Box<?> obj1)
    {
        System.out.println("Этот класс - " + this.obj.getClass().toString());
        System.out.println("Другой класс - " + obj1.obj.getClass().toString());
        if(this.obj.getClass()==obj1.obj.getClass()) return true;
        else
        return false;
    }

}
