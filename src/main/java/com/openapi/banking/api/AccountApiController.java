package com.openapi.banking.api;

import com.openapi.banking.impl.AccountService;
import com.openapi.banking.model.Account;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.openapi.banking.repository.AccountRepository;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-29T17:11:20.353+05:30")

@Controller
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

    public @ResponseBody
    ResponseEntity<List<Account>> doCheckBalance(@ApiParam(value = "Status values that need to be considered for filter",required=true) @PathVariable("accountNumber") String accountNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Account>>(objectMapper.readValue("[ {  \"Transaction\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"name\" : \"doggie\",  \"id\" : 0}, {  \"Transaction\" : {    \"name\" : \"name\",    \"id\" : 6  },  \"name\" : \"doggie\",  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Account>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Account>>(objectMapper.readValue("<null>  <id>123456789</id>  <name>doggie</name></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Account>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        List<Account> accounts=accountSerice.getAccountBalance(accountNumber);
        return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
    }

}
