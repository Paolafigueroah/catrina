/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import java.util.Date;
import mx.itson.catrina.enums.TransactionType;

/**
 *
 * @author Paola Figueroa
 */
public class Transaction {
    private Date date;
    private String description;
    private double amount;
    private TransactionType type;
    
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TransactionType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TransactionType type) {
        this.type = type;
    }
    
}
