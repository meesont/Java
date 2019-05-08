/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.bank.exceptions;

public class TransactionAmountInvalidException extends Exception {
    public TransactionAmountInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionAmountInvalidException(String message) {
        super(message);
    }
}
