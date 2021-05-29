package com.openapi.banking.impl;

import com.openapi.banking.model.Account;
import com.openapi.banking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccountBalance(String accountNumber) {
       return  accountRepository.findByAccountNumber(accountNumber);
    }
}
