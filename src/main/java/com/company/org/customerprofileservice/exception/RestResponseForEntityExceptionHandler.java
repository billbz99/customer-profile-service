package com.company.org.customerprofileservice.exception;

import com.company.org.customerprofileservice.models.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseForEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomerProfileServiceCustomException.class)
    public ResponseEntity<ErrorResponse> handleProductServiceException(CustomerProfileServiceCustomException exception) {
        return new ResponseEntity<>(new ErrorResponse().builder()
                .errorMessage(exception.getMessage())
                .errorCode(exception.getErrorCode())
                .build(), HttpStatus.NOT_FOUND
        );
    }

}
