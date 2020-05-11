package com.example.banking.configuration;

import com.example.banking.application.BankingApplicationPort;
import com.example.banking.application.business.BankingApplication;
import com.example.banking.repository.AccountRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
@Configuration
public class AppConfig {

    @Bean
    public BankingApplicationPort bankingApplicationPort(AccountRepositoryPort accountRepository) {
        BankingApplication bankingApplication = new BankingApplication();
        bankingApplication.setAccountRepository(accountRepository);
        return bankingApplication;
    }
}
