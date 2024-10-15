package com.moderntreasury.account.model;

import lombok.Data;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String type;
    private String currency;
    private String partyName;
    private String partyType;
    @Column(name = "ledger_account_id")
    private UUID ledgerAccountId;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime discardedAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AccountDetail> accountDetails;
}
