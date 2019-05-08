/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank.account;

import com.gmail.thomasmeeson.bank.enums.AccountType;

import java.util.Date;
import java.util.UUID;

public class Account {

    private AccountType type;
    private double balance;
    private Date creationDate;
    private UUID accountID;
    private String holderForename, holderSurname, holderTitle;

    /**
     * Creates an account object when the account has a known {@param balance}
     *
     * @param type           The bank account type
     * @param balance        The balance of the bank account
     * @param holderForename The account holders forename
     * @param holderSurname  The account holders surname
     * @param holderTitle    The account holders title
     */
    public Account(AccountType type, double balance, String holderForename, String holderSurname, String holderTitle) {
        this.type = type;
        this.balance = balance;
        this.holderForename = holderForename;
        this.holderSurname = holderSurname;
        this.holderTitle = holderTitle;

        this.creationDate = new Date();
        this.accountID = UUID.randomUUID();
    }

    /**
     * Creates an account object when the account has a an unknown balance
     *
     * @param type           The bank account type
     * @param holderForename The account holders forename
     * @param holderSurname  The account holders surname
     * @param holderTitle    The account holders title
     */
    public Account(AccountType type, String holderForename, String holderSurname, String holderTitle) {
        this.type = type;
        this.holderForename = holderForename;
        this.holderSurname = holderSurname;
        this.holderTitle = holderTitle;

        this.balance = 0;
        this.creationDate = new Date();
        this.accountID = UUID.randomUUID();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderForename() {
        return holderForename;
    }

    public void setHolderForename(String holderForename) {
        this.holderForename = holderForename;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public void setHolderSurname(String holderSurname) {
        this.holderSurname = holderSurname;
    }

    public String getHolderTitle() {
        return holderTitle;
    }

    public void setHolderTitle(String holderTitle) {
        this.holderTitle = holderTitle;
    }

    public AccountType getType() {
        return type;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public UUID getAccountID() {
        return accountID;
    }

}
