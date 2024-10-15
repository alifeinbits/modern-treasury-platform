package com.moderntreasury.payment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class ExpectedPayment {
    @Id
    @GeneratedValue
    private UUID id;
    private BigDecimal amount;
    private String direction;
    private String internalAccountId;
    private String type;
    private String status;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
