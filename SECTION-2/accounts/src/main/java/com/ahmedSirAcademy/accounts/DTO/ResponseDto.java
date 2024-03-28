package com.ahmedSirAcademy.accounts.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseDto {
  private String statusCode;
  private String statusMsg;
  private HttpStatus httpStatus;
}
