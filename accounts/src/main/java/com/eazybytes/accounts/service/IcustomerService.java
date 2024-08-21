package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface IcustomerService {
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
