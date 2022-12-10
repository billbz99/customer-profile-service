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
    private ViewCustomerProfileLookupRepository viewCustomerProfileLookupRepository;

    @Autowired
    private CustomerProfileService customerProfileService;

    @GetMapping(path="/search")
    public Optional<ViewCustomerProfileLookup> findQuery(@Valid @RequestParam(name="firstName") String firstname,
                                                         @RequestParam(name="lastName") String lastName,
                                                         @RequestParam(name="ssn") String ssn) {
        return viewCustomerProfileLookupRepository.findPersonAttributes(firstname, lastName, ssn);
    }

    @GetMapping(path="/searchByFirstNameLastNameLastFourSSN")
    public ResponseEntity<CustomerProfileLookupResponse> findCustomerProfileByFirstNameLastNameSSNLastFour(@Valid @RequestParam(name="firstName") String firstName,
                                                                                                           @RequestParam(name="lastName") String lastName,
                                                                                                           @RequestParam(name="ssn") String ssn) {

        HttpHeaders header = new HttpHeaders();
        header.add("desc", "Calling findCustomerProfileByFirstNameLastNameSSNLastFour");
        header.add("createBy", "OFP-SVC-11");
        header.add("requestBy", "APP-311");

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.findCustomerProfileByFirstNameLastNameLastNameSSNLastFour(firstName, lastName, ssn);

        return ResponseEntity.status(HttpStatus.OK)
                .headers(header)
                .body(customerProfileLookupResponse);
    }

    @GetMapping(path="/searchByPartyPhoneFullNumber1")
    public Optional<ViewCustomerProfileLookup> findQuery(@Valid @RequestParam(name="partyPhoneFullNumber") String partyPhoneFullNumber) {
        return viewCustomerProfileLookupRepository.findPersonAttributesByPartyPhoneFullNumber(partyPhoneFullNumber);
    }

    //http://localhost:8080/api/v1/customerlookup/searchByPartyClientNumber?partyClientNumber=123-765-7519
    @GetMapping(path="/searchByPartyClientNumber1")
    public Optional<ViewCustomerProfileLookup> findQueryPartyClientNumber(@Valid @RequestParam(name="partyClientNumber") String partyClientNumber) {
        return viewCustomerProfileLookupRepository.findByPartyClientNumber(partyClientNumber);
    }

    //http://localhost:8080/api/v1/customerlookup/searchByPartyPhoneFullNumber?partyPhoneFullNumber=123-765-7519
    @GetMapping(path="/searchByPartyPhoneFullNumber")
    public ResponseEntity<CustomerProfileLookupResponse> findCustomerProfileByPartyPhoneFullNumber(@Valid @RequestParam(name="partyPhoneFullNumber") String partyPhoneFullNumber) {

        HttpHeaders header = new HttpHeaders();
        header.add("desc", "Calling findCustomerProfileByPartyPhoneFullNumber");
        header.add("createBy", "OFP-SVC-11");
        header.add("requestBy", "APP-311");

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.findCustomerProfileByPartyPhoneFullNumber(partyPhoneFullNumber);

        return ResponseEntity.status(HttpStatus.OK)
                .headers(header)
                .body(customerProfileLookupResponse);
    }

    @GetMapping(path="/searchByPartyClientNumber")
    public ResponseEntity<CustomerProfileLookupResponse> findCustomerProfileByClientNumber(@Valid @RequestParam(name="partyClientNumber") String partyClientNumber) {

        HttpHeaders header = new HttpHeaders();
        header.add("desc", "Calling findCustomerProfileByPartyPhoneFullNumber");
        header.add("createBy", "OFP-SVC-11");
        header.add("requestBy", "APP-311");

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.findCustomerProfileByPartyClientNumber(partyClientNumber);

        return ResponseEntity.status(HttpStatus.OK)
                .headers(header)
                .body(customerProfileLookupResponse);
    }

    @GetMapping(path="/searchByAccountNumber")
    public ResponseEntity<CustomerProfileLookupResponse> findCustomerProfileByAccountNumber(@Valid @RequestParam(name="partyClientNumber") String accountNumber) {

        HttpHeaders header = new HttpHeaders();
        header.add("desc", "Calling findCustomerProfileByAccountNumber");
        header.add("createBy", "OFP-SVC-11");
        header.add("requestBy", "APP-311");

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.findCustomerProfileByAccountNumber(accountNumber);

        return ResponseEntity.status(HttpStatus.OK)
                .headers(header)
                .body(customerProfileLookupResponse);
    }

    @PostMapping(path="/searchByAccountNumber")
    public ResponseEntity<CustomerProfileLookupResponse> findCustomerProfileByAccountNumber(@RequestBody CustomerProfileRequest customerProfileRequest) {

        HttpHeaders header = new HttpHeaders();
        header.add("desc", "Calling findCustomerProfileByAccountNumber");
        header.add("createBy", "OFP-SVC-11");
        header.add("requestBy", "APP-311");

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.findCustomerProfileByAccountNumberNew(customerProfileRequest);

        return ResponseEntity.status(HttpStatus.OK)
                .headers(header)
                .body(customerProfileLookupResponse);
    }

    @PostMapping
    public ResponseEntity<CustomerProfileLookupResponse> processCustomerProfileRequest(@Valid @RequestBody CustomerProfileRequest customerProfileRequest) {

        CustomerProfileLookupResponse customerProfileLookupResponse
                = customerProfileService.processCustomerProfileRequest(customerProfileRequest);

        return ResponseEntity.status(HttpStatus.OK).body(customerProfileLookupResponse);
    }
}
