package com.openapi.banking.impl;

import com.openapi.banking.model.Account;
import com.openapi.banking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account getAccountBalance(String accountNumber) {
       return  accountRepository.findByAccountNumber(accountNumber);
    }
    public Account doFundTransfer(Account sourceAccount, Account targetAccount){

        List<Account> accountList =new ArrayList<Account>();
        accountList.add(sourceAccount);
        accountList.add(targetAccount);
         accountRepository.saveAll(accountList);
        sourceAccount.setStatus("Transfer Successful");
         return sourceAccount;
    }
}
