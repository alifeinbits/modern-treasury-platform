package com.moderntreasury.counterparty.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Counterparty {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private String accountNumber;
    private String routingNumber;
}
