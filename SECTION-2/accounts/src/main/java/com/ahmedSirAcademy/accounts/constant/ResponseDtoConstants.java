package com.ahmedSirAcademy.accounts.constant;

import lombok.Data;

@Data
public class ResponseDtoConstants {
  private ResponseDtoConstants() {
    // restrict instantiation;
    /*means no one should pollute this class by creating any methods and all inside this class and
     no one should create the object of this class*/
  }
  public static final String SAVING = "Account created successfully";
  public static final String  STATUS_201= "Account created successfully";
  public static final String  STATUS_400= "Customer Already exist with the given mobile number!!";
}
