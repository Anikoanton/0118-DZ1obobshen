package com.company;

import java.util.ArrayList;

/**
 * Created by Антон on 27.01.2018.
 */
public class Mas<T> {
    T[] mass;

    public Mas(T[] mass) {
        this.mass = mass;
    }

    public void changeEllement(int i, int j)
    {
        //  T[] mass=this.massive;
        T a=this.mass[i];
        this.mass[i]=mass[j];
        this.mass[j]=a;
        // return mass;
    };

    public ArrayList transformMass ()
    {
        int leng = this.mass.length;
        ArrayList arr = new ArrayList();

        for (int i=0; i<leng; i++)
        {
            arr.add(this.mass[i]);
        }
        return arr;
    }
}
