package com.com.exception.example;

/**
 * Created by vijeesh on 30/10/17.
 */
public class Main {

    public static void main (String a []) {

        Transfer t = new Transfer();

        try {
            boolean status = t.transferAmount("1234", "56767", 1000);
            if (status == true) {
                System.out.println("Transferred successfully !!!");
            }
        }
        catch (InvalidAmountException e){
            e.printStackTrace();
            System.out.println("Exception occured..");
        }
        catch (InvalidAccountException e) {
            e.printStackTrace();
            System.out.println("Exception occured..");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception occured..");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
