package com.example.domain;

import com.example.domain.Account;
import com.example.domain.AccountStatus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class BankingApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.setStatus(AccountStatus.BLOCKED);
        for (AccountStatus status : AccountStatus.values()){
            System.out.println(status.ordinal() + ": "+ status.name());
            System.out.println(status.getStatus() + ": "+ status.name());
        }
        List<Status> statusConstants = new ArrayList<>() ;
        statusConstants.add(AccountStatus.ACTIVE);
        statusConstants.add(CustomerStatus.GOLD);
        statusConstants.sort(Comparator.comparingInt(Status::getStatus));
        statusConstants.stream().filter(status -> status.getStatus() > 50)
                                .forEach(System.out::println);
    }
}
