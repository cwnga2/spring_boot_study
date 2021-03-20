package com.anson.config;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class/*for query*/)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String notValidException2(ConstraintViolationException ex) {
        //for query
        return ex.getMessage();
    }

    @ExceptionHandler(BindException.class)
    public String notValidException4(BindException ex) {
        //for query
        return ex.getMessage();
    }

}