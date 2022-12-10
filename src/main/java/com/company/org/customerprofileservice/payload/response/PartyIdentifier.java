package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyIdentifier {

    private String crdbPartyIdentifier;
    private Passport passport;
    private String socialSecurityNumber;
    private String taxIdentifierNumber;
    private DriverLicense driverLicense;
}
