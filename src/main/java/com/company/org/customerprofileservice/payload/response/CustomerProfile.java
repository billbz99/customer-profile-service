package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerProfile {

    private PartyPerson partyPerson;
    private PartyIdentifier partyIdentifier;
    private PartyContact partyContact;
    private PartyEmployment partyEmployment;
    private PartyFinance partyFinance;
}
