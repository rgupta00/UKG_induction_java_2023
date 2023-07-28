package com.empapp.controller;

import com.empapp.dto.ErrorMessage;
import com.empapp.excetions.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

//i want to handle all ex of my project using AOP
@RestControllerAdvice //throws adv
/*
@RestControllerAdvice=@ControllerAdvice(under the hood it use AOP)+@ResponseBody
 */
public class AppExHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorMessage> handle404(EmployeeNotFoundException ex){
        System.out.println("----------------------------------------------");
        ErrorMessage errorMessage=new ErrorMessage();
        errorMessage.setToContact("ravi@ukg.com");
        errorMessage.setLocalDateTime(LocalDateTime.now());
        errorMessage.setMessage(ex.getMessage());
        errorMessage.setStatusCode(HttpStatus.NOT_FOUND.toString());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handle500(Exception ex){
        System.out.println("----------------------------------------------");
        ErrorMessage errorMessage=new ErrorMessage();
        errorMessage.setToContact("ravi@ukg.com");
        errorMessage.setLocalDateTime(LocalDateTime.now());
        errorMessage.setMessage("pls try after some time");
        errorMessage.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
}

