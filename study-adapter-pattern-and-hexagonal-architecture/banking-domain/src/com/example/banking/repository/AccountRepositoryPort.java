package com.example.banking.repository;

import com.example.banking.domain.Account;
import com.example.banking.domain.Iban;

import java.util.Optional;

public interface AccountRepositoryPort {
    Optional<Account> findAccountByIban(Iban from);

    void saveAccount(Account acc);
}
