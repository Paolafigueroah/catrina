/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author Paola Figueroa
 */
public class Account {
    private String name;
    private double balance;
    private List<Transaction> transactions;
    private Customer customer;
    private AccountStatement accountState;
    
    public Account deserialize(String json){
        Account account = new Account();
        try{
            account = new Gson().fromJson(json, Account.class);
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return account;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the accountState
     */
    public AccountStatement getAccountState() {
        return accountState;
    }

    /**
     * @param accountState the accountState to set
     */
    public void setAccountState(AccountStatement accountState) {
        this.accountState = accountState;
    }

    
}
