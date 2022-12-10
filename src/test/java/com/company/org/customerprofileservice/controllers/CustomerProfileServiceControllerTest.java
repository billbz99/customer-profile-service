package com.company.org.customerprofileservice.controllers;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.company.org.customerprofileservice.payload.response.CustomerProfileLookupResponse;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;
import com.company.org.customerprofileservice.repository.ViewCustomerProfileLookupRepository;
import com.company.org.customerprofileservice.service.CustomerProfileService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CustomerProfileServiceController.class})
@ExtendWith(SpringExtension.class)
class CustomerProfileServiceControllerTest {
    @MockBean
    private CustomerProfileService customerProfileService;

    @Autowired
    private CustomerProfileServiceController customerProfileServiceController;

    @MockBean
    private ViewCustomerProfileLookupRepository viewCustomerProfileLookupRepository;

    /**
     * Method under test: {@link CustomerProfileServiceController#findCustomerProfileByAccountNumber(CustomerProfileRequest)}
     */
    @Test
    void testFindCustomerProfileByAccountNumber() throws Exception {
        when(customerProfileService.findCustomerProfileByAccountNumberNew((CustomerProfileRequest) any()))
                .thenReturn(new CustomerProfileLookupResponse());

        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setAccountNumber("42");
        customerProfileRequest.setCardNumber("42");
        customerProfileRequest.setCrdbPartyIdentifier("42");
        String content = (new ObjectMapper()).writeValueAsString(customerProfileRequest);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/api/v1/customerlookup/searchByAccountNumber")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        MockMvcBuilders.standaloneSetup(customerProfileServiceController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("{\"payload\":null}"));
    }
}

