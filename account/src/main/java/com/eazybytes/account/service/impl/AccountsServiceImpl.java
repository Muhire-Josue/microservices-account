package com.eazybytes.account.service.impl;

import com.eazybytes.account.dto.CustomerDto;
import com.eazybytes.account.repository.AccountRepository;
import com.eazybytes.account.repository.CustomerRepository;
import com.eazybytes.account.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
