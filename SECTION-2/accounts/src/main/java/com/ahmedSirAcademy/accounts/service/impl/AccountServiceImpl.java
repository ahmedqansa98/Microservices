package com.ahmedSirAcademy.accounts.service.impl;

import com.ahmedSirAcademy.accounts.DTO.CustomerDto;
import com.ahmedSirAcademy.accounts.constant.ExceptionConstant;
import com.ahmedSirAcademy.accounts.constant.GlobalConstant;
import com.ahmedSirAcademy.accounts.entity.Accounts;
import com.ahmedSirAcademy.accounts.entity.Customer;
import com.ahmedSirAcademy.accounts.exception.CustomerAlreadyExistException;
import com.ahmedSirAcademy.accounts.mapper.CustomerMapper;
import com.ahmedSirAcademy.accounts.repository.AccountsRepo;
import com.ahmedSirAcademy.accounts.repository.CustomerRepo;
import com.ahmedSirAcademy.accounts.service.IAccountService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

  @Autowired private CustomerRepo customerRepo;
  @Autowired private AccountsRepo accountsRepo;

  @Override
  public void createCustomer(CustomerDto customerDto) {

    Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
    Optional<Customer> byMobileNumber =
        customerRepo.findByMobileNumber(customerDto.getMobileNumber());
    if (byMobileNumber.isPresent()) {
      log.info("Checking customer is already exist or not!!");
      log.debug("Customer not created, hence throwing an exception!!");
      throw new CustomerAlreadyExistException(
          ExceptionConstant.STATUS_400 + customerDto.getMobileNumber());
    } else {
      customer.setCreatedAt(LocalDateTime.now());
      customer.setCreatedBy("Shahbaz");
      log.info("Creating a customer!!");
      Customer savedCustomer = customerRepo.save(customer);
      /* Now with the help of this savedCustomer in which we also have a customerId which is auto populate it
      by Strategy = GenerationType.Identity. using the customerId we need to create a new Account of the customer.
       */
      accountsRepo.save(createCustomerAccount(savedCustomer));
    }
  }

  private Accounts createCustomerAccount(Customer customer) {
    Accounts newAccounts = new Accounts();
    newAccounts.setCustomerId(customer.getCustomerId());
    log.info("generating account number for the customer {}", customer.getName());
    Random random = new Random();
    long randomAccountNumber = 1000000000L + random.nextInt(900000000);
    newAccounts.setAccountNumber(randomAccountNumber);
    newAccounts.setAccountType(GlobalConstant.SAVING_ACCOUNT);
    newAccounts.setBranchAddress(GlobalConstant.BRANCH_ADDRESS);
    newAccounts.setCreatedAt(LocalDateTime.now());
    newAccounts.setCreatedBy("Shahbaz");
    return newAccounts;
  }
}
