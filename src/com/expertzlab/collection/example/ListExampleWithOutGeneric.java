package com.expertzlab.collection.example;


import java.util.List;
import java.util.ArrayList;
/**
 * Created by vijeesh on 31/10/17.
 */
public class ListExampleWithOutGeneric {


    public static void main (String a[]){

        List list= new ArrayList();
        list.add(10);
        list.add("Hello");
        list.add (new Account("123456", "Ramu"));
        new ListExampleWithOutGeneric().  printList(list);

        printList(list);
    }

    static void printList(List list){

        for ( Object o  :  list){

           if (o instanceof  Account){
                Account a= (Account)o;
                System.out.println("Name: "+ a.name);
                System.out.println("Acc Number :"+ a.accountNumber);
        }

            System.out.println(o);

        }

    }


}

class Account{

    String accountNumber;
    String name;


    Account (String accountNumber, String name){
        this.accountNumber= accountNumber;
        this.name= name;
    }


}

