package com.company.org.customerprofileservice.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerProfileRequest {

    private String crdbPartyIdentifier;
    private String accountNumber;
    private String cardNumber;

    @Valid
    private Header header;
    private PayLoad payload;
}
