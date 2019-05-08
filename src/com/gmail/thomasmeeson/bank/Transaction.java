/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank;

import java.util.UUID;

public class Transaction {

    Account accountFrom, accountTo;
    double balance;
    UUID transactionID;


    public Transaction(Account accountFrom, Account accountTo, double balance, UUID transactionID) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.balance = balance;
        this.transactionID = transactionID;
    }


}
