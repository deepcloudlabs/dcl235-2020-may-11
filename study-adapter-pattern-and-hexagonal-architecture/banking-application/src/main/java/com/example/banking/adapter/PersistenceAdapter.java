package com.example.banking.adapter;

import com.example.banking.AccountRepository;
import com.example.banking.domain.Account;
import com.example.banking.domain.Iban;
import com.example.banking.domain.Money;
import com.example.banking.entity.AccountDocument;
import com.example.banking.repository.AccountRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
@Service
public class PersistenceAdapter implements AccountRepositoryPort {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public Optional<Account> findAccountByIban(Iban from) {
        var account = accountRepository.findById(from.getValue());
        if (account.isPresent()) {
            var acc = account.get();
            var entity = new Account(Iban.valueOf(acc.getIban()),
                    Money.valueOf(acc.getAmount(), acc.getCurrency()));
            return Optional.ofNullable(entity);
        }
        return Optional.empty();
    }

    @Override
    public void saveAccount(Account acc) {
        AccountDocument accountDocument = new AccountDocument();
        accountDocument.setIban(acc.getIban().getValue());
        accountDocument.setAmount(acc.getBalance().getValue());
        accountDocument.setCurrency(acc.getBalance().getCurrency());
        accountRepository.save(accountDocument);
    }
}
