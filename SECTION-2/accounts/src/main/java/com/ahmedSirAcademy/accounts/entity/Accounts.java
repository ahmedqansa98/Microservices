package com.ahmedSirAcademy.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long accountNumber;

  private long customerId;

  private String accountType;

  private String branchAddress;
}
