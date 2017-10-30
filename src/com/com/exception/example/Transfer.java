package com.com.exception.example;

/**
 * Created by vijeesh on 30/10/17.
 */
public class Transfer {



   public boolean transferAmount (String fromAccount, String toAccount, double amount) {
       boolean status = false;

       AccountNumberValidator validator= new AccountNumberValidator();

           if (validator.isValidAccount(fromAccount) && validator.isValidAccount(toAccount) ){

               if (amount > 50000){

                   throw new InvalidAmountException();

               }

               status= true;

           }


       return status;
    }



}
