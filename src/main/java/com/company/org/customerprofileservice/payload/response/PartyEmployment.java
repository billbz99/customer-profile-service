package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyEmployment {

    private String employmentStatus;
    private String employmentType;
    private String employerName;
    private String isRestrictedIndustryFlag;
    private String isSensitiveIndustryFlag;
    private String industry;
    private String subIndustry;
    private String occupation;
    private EmployerMailingAddress employerMailingAddress;
}
