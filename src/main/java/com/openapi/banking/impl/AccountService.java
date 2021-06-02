package com.openapi.banking.impl;

import com.openapi.banking.exception.ResourceNotFoundException;
import com.openapi.banking.model.Account;
import com.openapi.banking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account getAccountBalance(String accountNumber) {
        Account account =accountRepository.findByAccountNumber(accountNumber);
        if(ObjectUtils.isEmpty(account)){
            throw new ResourceNotFoundException("001000","No Account found");
        }
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
