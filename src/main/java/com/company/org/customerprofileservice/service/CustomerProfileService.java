package com.company.org.customerprofileservice.service;

import com.company.org.customerprofileservice.payload.response.CustomerProfileLookupResponse;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;

public interface CustomerProfileService {
    CustomerProfileLookupResponse processCustomerProfileRequest(CustomerProfileRequest customerProfileRequest);
}
