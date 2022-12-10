package com.company.org.customerprofileservice.payload.request;

import com.company.org.customerprofileservice.payload.response.ResidentialAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mandatory {

    private String accountNumber;
    private String cardNumber;
    private String crdbPartyIdentifier;
    private String primaryPhoneNumber;

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String passportNumber;

    private ResidentialAddress residentialAddress;
}
