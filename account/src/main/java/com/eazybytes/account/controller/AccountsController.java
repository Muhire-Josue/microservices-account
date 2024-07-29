package com.eazybytes.account.controller;

import com.eazybytes.account.dto.CustomerDto;
import com.eazybytes.account.dto.ResponseDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_CBOR_VALUE})
public class AccountsController {

    @PostMapping("create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto body){

    }
}
