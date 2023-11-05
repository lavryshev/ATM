/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techliterate.atm;

import java.util.Date;

/**
 *
 * @author lavryshev
 */
public class Transaction {
    
    /**
     * The amount of this transaction.
     */
    private double amount;
    
    /**
     * The time and date of this transaction.
     */
    private Date timestamp;
    
    /**
     * A memo for this transaction.
     */
    private String memo;
    
    /**
     * The account in which the transaction was performed.
     */
    private Account inAccount;

    /**
     * Create a new transaction
     * @param amount    the amount transacted
     * @param inAccount the account the transactions belongs to
     */
    public Transaction(double amount, Account inAccount) {
        
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
        
    }
    
    /**
     * Create a new transaction
     * @param amount    the amount transacted
     * @param memo      the memo for the transaction
     * @param inAccount the account the transactions belongs to
     */
    public Transaction(double amount, String memo, Account inAccount) {
        
        // call the two args constructor first
        this(amount, inAccount);
        
        // set the memo
        this.memo = memo;
        
    }
    
    /**
     * Get the amount of the transaction
     * @return the amount
     */
    public double getAmount() {
        return this.amount;
    }
    
    /**
     * Get a string summarizing of the transaction
     * @return the summary string
     */
    public String getSummaryLine() {
        
        if (amount >= 0) {
            return String.format("%s : $%.02f : %s", this.timestamp.toString(),
                    this.amount, this.memo);
        } else {
            return String.format("%s : $(%.02f) : %s", this.timestamp.toString(),
                    this.amount, this.memo);            
        }
        
    }
}
