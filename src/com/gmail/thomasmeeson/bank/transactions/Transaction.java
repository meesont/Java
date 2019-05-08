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
 *
 */

public class Transaction {

    private Account accountFrom, accountTo;
    private double balance;
    private UUID transactionID;
    private TransactionPriority transactionPriority;
    private TransactionType transactionType;

    /**
     * Create a transaction from one account to another
     * @param accountFrom
     * @param accountTo
     * @param balance
     * @param transactionID
     * @deprecated Replaced by Transaction(accountFrom, accountTo, balance,
     */
    public Transaction(Account accountFrom, Account accountTo, double balance, UUID transactionID) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.balance = balance;
        this.transactionID = transactionID;
    }

}
