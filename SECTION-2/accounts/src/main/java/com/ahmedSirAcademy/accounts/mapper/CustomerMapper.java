package com.ahmedSirAcademy.accounts.mapper;

import com.ahmedSirAcademy.accounts.DTO.CustomerDto;
import com.ahmedSirAcademy.accounts.entity.Customer;

public class CustomerMapper {

  public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
    //      int check = 0;
    //      StringBuilder lastFour = new StringBuilder();
    customerDto.setName(customer.getName());
    customerDto.setEmail(customer.getEmail());
    customerDto.setMobileNumber(customer.getMobileNumber());
    //      for (int i = customerDto.getMobileNumber().length() - 1; i >= 0; i--) {
    //        if (Character.isDigit(customerDto.getMobileNumber().charAt(i))) {
    //          check++;
    //        }
    //        if (check <= 4) {
    //          lastFour.append(customerDto.getMobileNumber().charAt(i));
    //        } else {
    //          lastFour.append(
    //              Character.isDigit(customerDto.getMobileNumber().charAt(i))
    //                  ? "*"
    //                  : customerDto.getMobileNumber().charAt(i));
    //
    //        }
    //        return lastFour.reverse().toString();
    //      }
    return customerDto;
  }

  //  public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
  //    customerDto.setName(customer.getName());
  //    customerDto.setEmail(customer.getEmail());
  //    customerDto.setMobileNumber(customer.getMobileNumber());
  //    return customerDto;
  //  }
  //
  //  public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
  //    customer.setName(customerDto.getName());
  //    customer.setEmail(customerDto.getEmail());
  //    customer.setMobileNumber(customerDto.getMobileNumber());
  //    return customer;
  //  }

  public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;
  }
}
