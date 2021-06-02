package com.openapi.banking.api;

import com.openapi.banking.impl.AccountService;
import com.openapi.banking.model.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-30T13:23:07.394Z")

@Controller
public class TransactionApiController implements TransactionApi {

    @Autowired
    private AccountService accountSerice;

    private static final Logger log = LoggerFactory.getLogger(TransactionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Account> doFundTransfer(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("sourceAccount") String sourceAccount, @ApiParam(value = "ID of pet to update",required=true) @PathVariable("targetAccount") String targetAccount, @ApiParam(value = "Updated status of the pet",required=true) @PathVariable("amount") Integer amount) {
        Account account=null;
        try{
            ResponseEntity<Account> response = null;
            Account source =accountSerice.getAccountBalance(sourceAccount);
            source.setCurrentBalance(source.getCurrentBalance()-amount);

           Account target = accountSerice.getAccountBalance(targetAccount);
            target.setCurrentBalance(target.getCurrentBalance()+amount);
            account = accountSerice.doFundTransfer(source,target);
            System.out.println("Amount ****"+account.getCurrentBalance());
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }


}
