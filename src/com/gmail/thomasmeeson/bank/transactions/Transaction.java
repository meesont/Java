/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank.transactions;

import com.gmail.thomasmeeson.bank.account.Account;
import com.gmail.thomasmeeson.bank.enums.TransactionPriority;
import com.gmail.thomasmeeson.bank.enums.TransactionType;

import java.util.UUID;

/**
 * A class to represent a unique transaction created on the server
 * @author Tom Meeson
 */

public class Transaction {

    private Account accountFrom, accountTo;
    private double balance;
    private UUID transactionID;
    private TransactionPriority transactionPriority;
    private TransactionType transactionType;


    public Transaction(Account accountFrom, Account accountTo, double balance, TransactionPriority transactionPriority, TransactionType transactionType) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.balance = balance;
        this.transactionPriority = transactionPriority;
        this.transactionType = transactionType;

        this.transactionID = UUID.randomUUID();
    }

    public Transaction(Account accountFrom, Account accountTo, double balance) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.balance = balance;

        this.transactionPriority = TransactionPriority.NORMAL;
        this.transactionType = TransactionType.SINGULAR;
        this.transactionID = UUID.randomUUID();
    }

    public Account getAccountFrom() {
        return accountFrom;
    }

    public Account getAccountTo() {
        return accountTo;
    }

    public double getBalance() {
        return balance;
    }

    public UUID getTransactionID() {
        return transactionID;
    }

    public TransactionPriority getTransactionPriority() {
        return transactionPriority;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setAccountFrom(Account accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(Account accountTo) {
        this.accountTo = accountTo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactionPriority(TransactionPriority transactionPriority) {
        this.transactionPriority = transactionPriority;
    }
}
