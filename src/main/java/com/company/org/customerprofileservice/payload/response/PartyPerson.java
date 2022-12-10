package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyPerson {

    private String partyUniqueIdentifier;
    private String prefixName;
    private String firstName;
    private String middleName;
    private String middleInitial;
    private String lastName;
    private String suffixName;
    private String maidenName;
    private String informalName;
    private String birthDate;
    private String deceasedFlag;
    private String citizenshipCountry;
    private String lastUpdateDate;
    private String classificationCode;
    private ArrayList<String> preferredLanguage;
}
