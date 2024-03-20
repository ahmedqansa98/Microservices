package com.ahmedSirAcademy.accounts.mapper;

import com.ahmedSirAcademy.accounts.DTO.AccountsDto;
import com.ahmedSirAcademy.accounts.DTO.CustomerDto;
import com.ahmedSirAcademy.accounts.entity.Accounts;
import com.ahmedSirAcademy.accounts.entity.Customer;

public class AcountsMapper {

  private static AccountsDto accountsDto(Accounts accounts, AccountsDto accountsDto) {
    accountsDto.setAccountNumber(accounts.getAccountNumber());
    accountsDto.setAccountType(accounts.getAccountType());
    accountsDto.setBranchAddress(accounts.getBranchAddress());
    return accountsDto;
  }

  private static Accounts accounts(AccountsDto accountsDto, Accounts accounts) {
    accounts.setAccountNumber(accountsDto.getAccountNumber());
    accounts.setAccountType(accountsDto.getAccountType());
    accounts.setBranchAddress(accountsDto.getBranchAddress());
    return accounts;
  }
}
