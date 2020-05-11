package com.example.banking.application;

import com.example.banking.domain.Iban;
import com.example.banking.domain.Money;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// API
public interface BankingApplicationPort {
    public void havale(Iban from, Iban to, Money amount);
}
