package com.moderntreasury.account.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class AccountDetail {
    @Id
    @GeneratedValue
    private UUID id;
    private String accountNumber;
    private String accountNumberType;
}
