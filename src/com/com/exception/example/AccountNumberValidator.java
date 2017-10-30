package com.com.exception.example;

/**
 * Created by vijeesh on 30/10/17.
 */
public class AccountNumberValidator {

    boolean isValidAccount(String accountNUmnber)  throws InvalidAccountException {

        boolean isValid =false;
        if (accountNUmnber.length() > 5) {
            throw new InvalidAccountException();
        }

        isValid = true;
        return isValid;
    }
}

