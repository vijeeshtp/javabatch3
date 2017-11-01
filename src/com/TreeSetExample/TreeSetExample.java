package com.TreeSetExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by vijeesh on 01/11/17.
 */
public class TreeSetExample {

    public static void main(String a[]) {

        Set<String> set = new TreeSet<>();
        set.add("ssss");
        set.add("aaa");
        set.add("www");

        System.out.println(set);

        Set<Account> accSet = new TreeSet<>();

        accSet.add(new Account(123, "aaaa", 22, 10000));
        accSet.add(new Account(456, "aaaa", 22, 78782));
        accSet.add(new Account(789, "aaaa", 22, 77));
        accSet.add(new Account(432, "aaaa", 22, 55545));
        accSet.add(new Account(232, "aaaa", 22, 10000));



        List<Account> accList = new ArrayList<>();

        accList.add(new Account(123, "aaaa", 22, 10000));
        accList.add(new Account(456, "aaaa", 45, 78782));
        accList.add(new Account(789, "aaaa", 33, 77));
        accList.add(new Account(432, "aaaa", 28, 55545));
        accList.add(new Account(232, "aaaa", 55, 10000));


        System.out.println(accSet);

        Collections.sort(accList, new BalanceComarator());
        System.out.println("Balance Sorting >>"+ accList);


        Collections.sort(accList, new AgeComarator());
        System.out.println("Age Sorting >>"+ accList);


        //System.out.println(Collections.sort(accList, new BalanceComarator()));

    }

}

    class Account implements Comparable<Account> {

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



class BalanceComarator implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return o1.balance-o2.balance;
    }
}

class AgeComarator implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return o1.age-o2.age;
    }
}


