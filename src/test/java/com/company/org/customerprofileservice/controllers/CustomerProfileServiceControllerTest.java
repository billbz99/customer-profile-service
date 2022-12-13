package com.company.org.customerprofileservice.controllers;

import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;
import com.company.org.customerprofileservice.payload.request.Header;
import com.company.org.customerprofileservice.payload.request.PayLoad;
import com.company.org.customerprofileservice.service.CustomerProfileService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
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

    /**
     * Method under test: {@link CustomerProfileServiceController#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest() throws Exception {
        CustomerProfileRequest customerProfileRequest = new CustomerProfileRequest();
        customerProfileRequest.setAccountNumber("42");
        customerProfileRequest.setCardNumber("42");
        customerProfileRequest.setCrdbPartyIdentifier("42");
        customerProfileRequest
                .setHeader(new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100", "Requested By", "42", "42"));
        customerProfileRequest.setPayload(new PayLoad());
        String content = (new ObjectMapper()).writeValueAsString(customerProfileRequest);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/customers/v1.0/customerprofile")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(customerProfileServiceController)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(405));
    }
}

