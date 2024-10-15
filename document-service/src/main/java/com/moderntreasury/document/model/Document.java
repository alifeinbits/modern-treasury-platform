package com.moderntreasury.document.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Entity
public class Document {
    @Id
    @GeneratedValue
    private UUID id;
    private String documentType;
    private String fileName;
    private String fileType;
    private String documentDetails;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
