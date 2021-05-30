/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.openapi.banking.api;

import com.openapi.banking.model.Account;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-30T13:23:07.394Z")

@Validated
@Api(value = "account", description = "the account API")
@RequestMapping(value = "/")
public interface AccountApi {

    @ApiOperation(value = "Transfer funds from one account to other account", nickname = "doCheckBalance", notes = "Multiple status values can be provided with comma separated strings", response = Account.class, responseContainer = "List", tags={ "Account Balance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/account/checkAccountBalance/{accountNumber}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Account> doCheckBalance(@ApiParam(value = "Status values that need to be considered for filter",required=true) @PathVariable("accountNumber") String accountNumber);

}
