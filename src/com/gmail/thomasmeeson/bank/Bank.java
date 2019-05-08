/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank;

import com.gmail.thomasmeeson.bank.account.Account;
import com.gmail.thomasmeeson.bank.enums.AccountType;

import java.util.UUID;

public class Bank {

    public static void main(String[] args) {
        Account mainAccount = new Account(AccountType.CURRENT, "Thomas", "Meeson", "Mr");
        UUID mainAccountID = mainAccount.getAccountID();
        System.out.println(
                "Account Details\n\n"
                + "Surname: " + mainAccount.getHolderSurname() + "\n"
                + "Forname: " + mainAccount.getHolderForename() + "\n"
                + "UUID: " + mainAccountID);
    }
}
