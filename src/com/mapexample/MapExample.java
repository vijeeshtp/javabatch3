package com.mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by vijeesh on 01/11/17.
 */
public class MapExample {

    public static void main (String a[]){

        Map<Integer , Account> accMap = new HashMap<>();

        Account acc1= new Account(123, "aaaa", 22, 677);
        Account acc2= new Account(456, "aaaa", 22, 677);
        Account acc3= new Account(788, "aaaa", 22, 677);
        Account acc4= new Account(123, "aaaa", 22, 677);
        Account acc5= new Account(878, "aaaa", 22, 677);
        Account acc6= new Account(788, "aaaa", 22, 677);
        Account acc7= new Account(123, "aaaa", 22, 677);

        accMap.put(acc1.id, acc1);
        accMap.put(acc2.id, acc2);
        accMap.put(acc3.id, acc3);
        accMap.put(acc4.id, acc4);
        accMap.put(acc5.id, acc5);
        accMap.put(acc6.id, acc6);
        accMap.put(acc7.id, acc7);

        //System.out.println(accMap);


        Account acc= accMap.get(123) ;
        System.out.println(acc);


        Set<Integer> keys =accMap.keySet();

        for (Integer key: keys){
            System.out.println(  accMap.get(key));

        }

        for (Entry e :accMap.entrySet()) {

            System.out.println("Key >>"+ e.getKey());
            System.out.println("Value>>"+ e.getValue());

        }

    }

}


class Account {

    int id;

    String name;

    int age;

    int balance;

    public int compareTo(Account o){
        return id-o.id;
    }

    public Account(int id, String name, int age, int balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", balance=" + balance +
              '}';
    }
}
