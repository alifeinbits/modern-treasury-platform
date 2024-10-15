package com.moderntreasury.payment.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class PaymentOrderAttempt {
    @Id
    @GeneratedValue
    private UUID id;
    private String status;
    private String failureReason;
    private String estimatedCompletionDate;
    private String referenceNumbers;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
