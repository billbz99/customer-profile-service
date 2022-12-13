package com.company.org.customerprofileservice.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.company.org.customerprofileservice.exception.CustomerProfileServiceCustomException;
import com.company.org.customerprofileservice.payload.request.CustomerProfileRequest;
import com.company.org.customerprofileservice.payload.request.Header;
import com.company.org.customerprofileservice.payload.request.Mandatory;
import com.company.org.customerprofileservice.payload.request.PayLoad;
import com.company.org.customerprofileservice.payload.request.Request;
import com.company.org.customerprofileservice.repository.ViewCustomerProfileLookupRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CustomerProfileServiceImpl.class})
@ExtendWith(SpringExtension.class)
class CustomerProfileServiceImplTest {
    @Autowired
    private CustomerProfileServiceImpl customerProfileServiceImpl;

    @MockBean
    private ViewCustomerProfileLookupRepository viewCustomerProfileLookupRepository;

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest() {
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(new CustomerProfileRequest()));
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(null));
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest2() {
        Header header = new Header(1L, "42", 1L, "Jan 1, 2020 8:00am GMT+0100",
                "Bad or missing fields required for input", "42", "42");

        assertThrows(CustomerProfileServiceCustomException.class, () -> customerProfileServiceImpl
                .processCustomerProfileRequest(new CustomerProfileRequest("42", "42", "42", header, new PayLoad())));
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest3() {
        CustomerProfileRequest customerProfileRequest = mock(CustomerProfileRequest.class);
        when(customerProfileRequest.getPayload())
                .thenReturn(new PayLoad("Bad or missing fields required for input", new Request()));
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(customerProfileRequest));
        verify(customerProfileRequest, atLeast(1)).getPayload();
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest4() {
        PayLoad payLoad = mock(PayLoad.class);
        when(payLoad.getAction())
                .thenThrow(new CustomerProfileServiceCustomException("An error occurred", "An error occurred"));
        CustomerProfileRequest customerProfileRequest = mock(CustomerProfileRequest.class);
        when(customerProfileRequest.getPayload()).thenReturn(payLoad);
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(customerProfileRequest));
        verify(customerProfileRequest, atLeast(1)).getPayload();
        verify(payLoad).getAction();
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest5() {
        CustomerProfileRequest customerProfileRequest = mock(CustomerProfileRequest.class);
        when(customerProfileRequest.getPayload())
                .thenThrow(new CustomerProfileServiceCustomException("An error occurred", "An error occurred"));
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(customerProfileRequest));
        verify(customerProfileRequest).getPayload();
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest6() {
        CustomerProfileRequest customerProfileRequest = mock(CustomerProfileRequest.class);
        when(customerProfileRequest.getPayload()).thenReturn(
                new PayLoad("Bad or missing fields required for input", new Request(new Mandatory(), "Optional")));
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(customerProfileRequest));
        verify(customerProfileRequest, atLeast(1)).getPayload();
    }

    /**
     * Method under test: {@link CustomerProfileServiceImpl#processCustomerProfileRequest(CustomerProfileRequest)}
     */
    @Test
    void testProcessCustomerProfileRequest7() {
        Request request = mock(Request.class);
        when(request.getMandatory())
                .thenThrow(new CustomerProfileServiceCustomException("An error occurred", "An error occurred"));
        CustomerProfileRequest customerProfileRequest = mock(CustomerProfileRequest.class);
        when(customerProfileRequest.getPayload())
                .thenReturn(new PayLoad("Bad or missing fields required for input", request));
        assertThrows(CustomerProfileServiceCustomException.class,
                () -> customerProfileServiceImpl.processCustomerProfileRequest(customerProfileRequest));
        verify(customerProfileRequest, atLeast(1)).getPayload();
        verify(request).getMandatory();
    }
}

