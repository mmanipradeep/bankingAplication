package com.openapi.banking.exception;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component
@Data
public class ResourceNotFoundException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public ResourceNotFoundException(){

    }
    public ResourceNotFoundException(String errorCode,String errorMessage) {
        super();

        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }
}
