/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank.transactions;

import com.gmail.thomasmeeson.bank.account.Account;

import java.util.UUID;

public class TransactionMethods {

    public UUID createTransaction(Account sender, Account reciever, double balance) {
        Transaction transaction = new Transaction(sender, reciever, balance);

        return transaction.getTransactionID();
    }

//    public String lookupTransaction(UUID transactionId) {
//
//    }

}
