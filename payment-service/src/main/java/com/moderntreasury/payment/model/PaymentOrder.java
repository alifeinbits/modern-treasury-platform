package com.moderntreasury.payment.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class PaymentOrder {
    @Id
    @GeneratedValue
    private UUID id;
    private String type;
    private String subtype;
    private BigDecimal amount;
    private String direction;
    private String priority;
    private String originatingAccountId;
    private String receivingAccountId;
    private String status;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PaymentOrderAttempt> attempts;
}
