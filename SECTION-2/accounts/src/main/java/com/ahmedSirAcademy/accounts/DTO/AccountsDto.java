package com.ahmedSirAcademy.accounts.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountsDto {

  private long accountNumber;

  private String accountType;

  private String branchAddress;

  public AccountsDto() {}
}
