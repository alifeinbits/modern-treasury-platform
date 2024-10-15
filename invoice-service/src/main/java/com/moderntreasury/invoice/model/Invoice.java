package com.moderntreasury.invoice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private UUID id;
    private String counterpartyId;
    private BigDecimal amount;
    private String currency;
    private String status;
    private OffsetDateTime dueDate;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
