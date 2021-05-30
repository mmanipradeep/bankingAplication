package com.cucumber;

import com.openapi.banking.impl.AccountService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.swagger.Swagger2SpringBoot;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class StepDefinitions {

    HttpUriRequest request;
    HttpResponse httpResponse;

    @Autowired
    AccountService accountService;

    @Given("^I set GET account service api endpoint$")
    public void iSetGETAccountServiceApiEndpoint() throws IOException {

        accountService.getAccountBalance("1000");
        // String name = RandomStringUtils.randomAlphabetic( 8 );
        request = new HttpGet( "http://localhost:8080/account/checkAccountBalance/700" );


    }

    @When("^I set request HEADER$")
    public void iSetRequestHEADER() throws IOException {
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
    }

    @Then("^I receive valid HTTP response code (\\d+)$")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        assertThat(
                httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_OK));

    }
}
