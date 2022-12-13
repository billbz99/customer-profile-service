package com.company.org.customerprofileservice.payload.response;

import com.company.org.customerprofileservice.payload.request.Header;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerProfileLookupResponse {

    @NotEmpty(message = "Header can not be empty")
    private Header header;
    private Payload payload;

    public CustomerProfileLookupResponse(Payload payload) {
    }
}
