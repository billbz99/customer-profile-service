package com.company.org.customerprofileservice.exception;

import lombok.Data;

@Data
public class CustomerProfileServiceCustomException extends RuntimeException {

    private String errorCode;

    public CustomerProfileServiceCustomException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
