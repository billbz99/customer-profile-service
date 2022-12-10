package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passport {

    private String issuingAuthority;
    private String issuingCountry;
    private String passportNumber;
    private String issueDate;
    private String expirationDate;
}
