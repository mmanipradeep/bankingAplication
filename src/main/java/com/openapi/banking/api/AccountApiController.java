package com.openapi.banking.api;

import com.openapi.banking.exception.ResourceNotFoundException;
import com.openapi.banking.impl.AccountService;
import com.openapi.banking.model.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-30T13:23:07.394Z")

@RestController
public class AccountApiController implements AccountApi {

    @Autowired
    private AccountService accountSerice;

    private static final Logger log = LoggerFactory.getLogger(AccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Account> doCheckBalance(@ApiParam(value = "Status values that need to be considered for filter",required=true)
                                                     @PathVariable("accountNumber") String accountNumber) {
            Account account = accountSerice.getAccountBalance(accountNumber);
            return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

}
