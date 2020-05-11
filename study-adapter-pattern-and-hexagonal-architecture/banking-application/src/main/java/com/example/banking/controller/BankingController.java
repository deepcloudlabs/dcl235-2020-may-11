package com.example.banking.controller;

import com.example.banking.application.BankingApplicationPort;
import com.example.banking.domain.Iban;
import com.example.banking.domain.Money;
import com.example.banking.domain.MoneyCurrency;
import com.example.banking.dto.HavaleRequest;
import com.example.banking.dto.HavaleResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
@RestController
@RequestScope
@RequestMapping("accounts")
@CrossOrigin
public class BankingController {
    private BankingApplicationPort bankingApplication;

    public BankingController(BankingApplicationPort bankingApplication) {
        this.bankingApplication = bankingApplication;
    }

    @PostMapping
    public HavaleResponse havale(@RequestBody HavaleRequest havaleRequest) {
        this.bankingApplication.havale(
                Iban.valueOf(havaleRequest.getFromIban()),
                Iban.valueOf(havaleRequest.getToIban()),
                Money.valueOf(havaleRequest.getAmount(),
                        MoneyCurrency.valueOf(havaleRequest.getCurrency()))
        );
        return new HavaleResponse("success");
    }
}
