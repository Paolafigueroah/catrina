/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import mx.itson.catrina.enums.TransactionType;

/**
 *
 * @author Paola Figueroa
 */
public class AccountStatement {
   private String account;
   private String clabe;
   private String currency;
   private double totalWithdrawals;
   private double tatalDeposits;
   private double finalBalance;
   
   public AccountStatement deserialize(String json){
        AccountStatement accountState = new AccountStatement();
        try{
            accountState = new Gson().fromJson(json, AccountStatement.class);
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return accountState;
    }
   
    
    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the totalWithdrawals
     */
    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    /**
     * @param totalWithdrawals the totalWithdrawals to set
     */
    public void setTotalWithdrawals(double totalWithdrawals) {
        this.totalWithdrawals = totalWithdrawals;
    }

    /**
     * @return the tatalDeposits
     */
    public double getTatalDeposits() {
        return tatalDeposits;
    }

    /**
     * @param tatalDeposits the tatalDeposits to set
     */
    public void setTatalDeposits(double tatalDeposits) {
        this.tatalDeposits = tatalDeposits;
    }

    /**
     * @return the finalBalance
     */
    public double getFinalBalance() {
        return finalBalance;
    }

    /**
     * @param finalBalance the finalBalance to set
     */
    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    private Iterable<Transaction> getTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
