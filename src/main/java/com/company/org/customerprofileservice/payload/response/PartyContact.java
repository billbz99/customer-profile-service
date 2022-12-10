package com.company.org.customerprofileservice.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PartyContact {

    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;
    private String primaryEmailAddress;
    private ResidentialAddress residentialAddress;
    private MailingAddress mailingAddress;
}
