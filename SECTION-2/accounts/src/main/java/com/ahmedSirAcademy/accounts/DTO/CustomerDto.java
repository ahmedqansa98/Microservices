package com.ahmedSirAcademy.accounts.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDto {
  private String name;
  private String email;
  private String mobileNumber;
}
