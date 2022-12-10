package com.company.org.customerprofileservice.controllers;

import com.company.org.customerprofileservice.util.FieldErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExceptionHandlerController {

    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    List<FieldErrorMessage> exceptionHandler(MethodArgumentNotValidException e) {
        List<FieldError> fieldErrorList = e.getBindingResult().getFieldErrors();
        return fieldErrorList.stream().map(x-> new FieldErrorMessage(x.getField(), x.getDefaultMessage())).collect(Collectors.toList());
    }

    @ResponseBody
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    List<FieldErrorMessage> exceptionHandler(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> fieldErrorList = e.getConstraintViolations();
        return fieldErrorList.stream().map(x-> new FieldErrorMessage(x.getPropertyPath().toString(), x.getMessage())).collect(Collectors.toList());
    }
}
