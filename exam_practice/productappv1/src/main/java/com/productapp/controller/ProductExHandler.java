package com.productapp.controller;

import com.productapp.dto.ErrorMessage;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//AOP as soon as some ex comes in the project control transfer ho jata heta

//@RestControllerAdvice and @ExceptionHandler
@RestControllerAdvice
public class ProductExHandler {
    //how to handle ex
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessage> handle404(ProductNotFoundException ex){
        ErrorMessage errorMessage=new ErrorMessage();
        errorMessage.setMessage(ex.getMessage());
        errorMessage.setStatusCode(HttpStatus.NOT_FOUND.toString());
        errorMessage.setToContact("ravi@ukg.com");

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
