package com.openapi.banking.api;

import com.openapi.banking.exception.ResourceNotFoundException;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExtendedControllerAdvice {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleResourceEmpty(ResourceNotFoundException resourceNotFoundException){
        return new ResponseEntity<String>(resourceNotFoundException.getErrorCode(),HttpStatus.NOT_FOUND);
    }

}
