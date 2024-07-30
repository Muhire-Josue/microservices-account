package com.eazybytes.account.service;

import com.eazybytes.account.dto.CustomerDto;

public interface IAccountsService {


    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
}
