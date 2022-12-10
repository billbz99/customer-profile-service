package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverLicense {

    private String issuingAuthority;
    private String issuingCountry;
    private String issuingStateProvince;
    private String licenseNumber;
    private String issueDate;
    private String expirationDate;
}
