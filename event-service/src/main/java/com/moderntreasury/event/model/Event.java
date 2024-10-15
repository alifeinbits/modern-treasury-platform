package com.moderntreasury.event.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class Event {
    @Id
    @GeneratedValue
    private UUID id;
    private String eventName;
    private String resourceType;
    private String resourceId;
    private String payload;
    private OffsetDateTime createdAt;
}
