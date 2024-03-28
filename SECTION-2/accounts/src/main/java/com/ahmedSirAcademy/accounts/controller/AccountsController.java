package com.ahmedSirAcademy.accounts.controller;

import com.ahmedSirAcademy.accounts.DTO.CustomerDto;
import com.ahmedSirAcademy.accounts.DTO.ResponseDto;
import com.ahmedSirAcademy.accounts.constant.GlobalConstant;
import com.ahmedSirAcademy.accounts.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
    path = "/api",
    produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

  @Autowired private IAccountService iaccountService;

  @PostMapping("/generate")
  public ResponseEntity<ResponseDto> createdAccount(@RequestBody CustomerDto customerDto) {
    iaccountService.createCustomer(customerDto);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(
            new ResponseDto(
                GlobalConstant.STATUS_201, GlobalConstant.MESSAGE_201, HttpStatus.CREATED));
  }
}
