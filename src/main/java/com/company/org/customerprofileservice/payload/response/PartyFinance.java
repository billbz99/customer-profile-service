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
public class PartyFinance {

    private ArrayList<String> sourceOfWealth;
    private String annualIncomeUSD;
    private String liquidNetWorthAmountUSD;
    private String wealthNotInUSAFlag;
    private String wealthNotInUSACountry;

}
