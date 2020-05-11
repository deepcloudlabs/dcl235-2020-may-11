package com.example.banking.application.business;

import com.example.banking.application.BankingApplicationPort;
import com.example.banking.domain.Account;
import com.example.banking.domain.Iban;
import com.example.banking.domain.Money;
import com.example.banking.repository.AccountRepositoryPort;

import java.util.function.Consumer;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
// Domain -> Application -> Use-case implementations
// Facade Pattern
public class BankingApplication implements BankingApplicationPort {
    // SPI
    private AccountRepositoryPort accountRepository;

    public void setAccountRepository(AccountRepositoryPort accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void havale(Iban from, Iban to, Money amount) {

        var fromAccount = accountRepository.findAccountByIban(from);
        var toAccount = accountRepository.findAccountByIban(to);
        if (fromAccount.isPresent() && toAccount.isPresent()) {
            Consumer<Account> withdraw = acc -> acc.withdraw(amount);
            Consumer<Account> deposit = acc -> acc.deposit(amount);
            Consumer<Account> saveAccount = acc -> accountRepository.saveAccount(acc);
            fromAccount.ifPresent(withdraw.andThen(saveAccount));
            toAccount.ifPresent(deposit.andThen(saveAccount));
            return;
        }
        throw new IllegalArgumentException("Cannot find one or more accounts");
    }
}
