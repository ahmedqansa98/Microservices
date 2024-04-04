package com.ahmedSirAcademy.accounts.mapper;

import com.ahmedSirAcademy.accounts.DTO.AccountsDto;
import com.ahmedSirAcademy.accounts.entity.Accounts;

public class AccountsMapper {

  public static AccountsDto accountsDto(Accounts accounts, AccountsDto accountsDto) {
    accountsDto.setAccountNumber(accounts.getAccountNumber());
    accountsDto.setAccountType(accounts.getAccountType());
    accountsDto.setBranchAddress(accounts.getBranchAddress());
    return accountsDto;
  }

  public static Accounts accounts(AccountsDto accountsDto, Accounts accounts) {
    accounts.setAccountNumber(accountsDto.getAccountNumber());
    accounts.setAccountType(accountsDto.getAccountType());
    accounts.setBranchAddress(accountsDto.getBranchAddress());
    return accounts;
  }
}
