package com.company.org.customerprofileservice.controllers;

import com.company.org.customerprofileservice.entity.ViewCustomerProfileLookup;
import com.company.org.customerprofileservice.payload.response.CustomerProfileLookupResponse;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;
import com.company.org.customerprofileservice.repository.ViewCustomerProfileLookupRepository;
import com.company.org.customerprofileservice.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/customers/v1.0/customerprofile")
public class CustomerProfileServiceController {
    @Autowired
    private CustomerProfileService customerProfileService;

    @PostMapping
    public ResponseEntity<CustomerProfileLookupResponse> processCustomerProfileRequest(@Valid @RequestBody CustomerProfileRequest customerProfileRequest) {

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.processCustomerProfileRequest(customerProfileRequest);

        return ResponseEntity.status(HttpStatus.OK).body(customerProfileLookupResponse);
    }
}
