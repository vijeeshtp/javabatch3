package com.expertzlab.collection.example;


import java.util.Set;
import java.util.HashSet;
/**
 * Created by vijeesh on 31/10/17.
 */
public class SetExample {

    public static void main (String a[]){

        Set set= new HashSet();
        set.add(new Account("1234", "Vijeesh"));
        set.add(new Account("1234", "Vijeesh"));
        set.add(new Account("1234", "Vijeesh"));


        System.out.println(set);

    }


}




