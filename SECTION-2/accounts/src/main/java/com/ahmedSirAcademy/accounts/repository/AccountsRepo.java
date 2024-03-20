package com.ahmedSirAcademy.accounts.repository;

import com.ahmedSirAcademy.accounts.entity.Accounts;
import com.ahmedSirAcademy.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepo extends JpaRepository<Accounts, Long> {}
