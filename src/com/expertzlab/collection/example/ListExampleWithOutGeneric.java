package com.expertzlab.collection.example;


import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Created by vijeesh on 31/10/17.
 */
public class ListExampleWithOutGeneric {


    public static void main (String a[]){

        List <Account> list= new LinkedList();
        list.add (new Account("123456", "Ramu"));
        list.add(new Account("654564", "Tom"));
        list.add (new Account("123456", "Ramu"));

        list.add (new Account("123456", "Ramu"));
        list.add (new Account("123456", "Ramu"));


        //new ListExampleWithOutGeneric().  printList(list);
        printList(list);

    }

    static void printList(List<Account> list){

        for ( Account account  :  list){
                System.out.println("Name: "+ account.name);
                System.out.println("Acc Number :"+ account.accountNumber);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);

    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Account{" +
              "accountNumber='" + accountNumber + '\'' +
              ", name='" + name + '\'' +
              '}';
    }
}

