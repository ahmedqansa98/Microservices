package com.ahmedSirAcademy.accounts.service.impl;

import com.ahmedSirAcademy.accounts.DTO.AccountsDto;
import com.ahmedSirAcademy.accounts.DTO.CustomerDto;
import com.ahmedSirAcademy.accounts.constant.GlobalConstant;
import com.ahmedSirAcademy.accounts.entity.Accounts;
import com.ahmedSirAcademy.accounts.entity.Customer;
import com.ahmedSirAcademy.accounts.mapper.CustomerMapper;
import com.ahmedSirAcademy.accounts.repository.AccountsRepo;
import com.ahmedSirAcademy.accounts.repository.CustomerRepo;
import com.ahmedSirAcademy.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

  @Autowired private CustomerRepo customerRepo;
  @Autowired private AccountsRepo accountsRepo;

  @Override
  public void createCustomer(CustomerDto customerDto) {

    Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
    Customer savedCustomer = customerRepo.save(customer);
    /* Now with the help of this savedCustomer in which we also have a customerId which is auto populate it
    by Strategy = GenerationType.Identity. using the customerId we need to create a new Account of the customer.
     */
    accountsRepo.save(createCustomerAccount(savedCustomer));
  }

  private Accounts createCustomerAccount(Customer customer) {
    Accounts newAccounts = new Accounts();
    newAccounts.setCustomerId(customer.getCustomerId());
    log.debug("generating account number for the customer {}", customer.getName());
    long randomAccountNumber = (1000000000L + new Random().nextInt(900000000));
    newAccounts.setAccountNumber(randomAccountNumber);
    newAccounts.setAccountType(GlobalConstant.SAVING_ACCOUNT);
    newAccounts.setBranchAddress(GlobalConstant.BRANCH_ADDRESS);
    return newAccounts;
  }
}
