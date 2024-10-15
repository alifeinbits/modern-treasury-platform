package com.moderntreasury.fx.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class ForeignExchangeQuote {
    @Id
    @GeneratedValue
    private UUID id;
    private String baseCurrency;
    private String quoteCurrency;
    private BigDecimal exchangeRate;
    private BigDecimal amount;
    private OffsetDateTime expiresAt;
    private OffsetDateTime createdAt;
}
