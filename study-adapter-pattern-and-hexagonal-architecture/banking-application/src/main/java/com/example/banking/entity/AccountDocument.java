package com.example.banking.entity;

import com.example.banking.domain.MoneyCurrency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
@Document(collection = "accounts")
public class AccountDocument {
    @Id
    private String iban;
    private double amount;
    private MoneyCurrency currency;

    public AccountDocument() {
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public MoneyCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(MoneyCurrency currency) {
        this.currency = currency;
    }
}
