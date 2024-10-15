package com.moderntreasury.ledger.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
public class LedgerAccount {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String currency;
    private BigDecimal balance;
}
