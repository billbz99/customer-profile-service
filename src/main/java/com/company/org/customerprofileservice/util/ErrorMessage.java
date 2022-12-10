package com.company.org.customerprofileservice.util;

public class ErrorMessage {

    String errorMessage;
    String status;

    public ErrorMessage(String errorMessage, String status) {
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public String getErrorMessage() { return errorMessage; }

    public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
