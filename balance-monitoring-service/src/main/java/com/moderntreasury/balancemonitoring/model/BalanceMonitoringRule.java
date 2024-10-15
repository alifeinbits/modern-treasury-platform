package com.moderntreasury.balancemonitoring.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class BalanceMonitoringRule {
    @Id
    @GeneratedValue
    private UUID id;
    private String accountId;
    private String type;
    private BigDecimal threshold;
    private String direction;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
