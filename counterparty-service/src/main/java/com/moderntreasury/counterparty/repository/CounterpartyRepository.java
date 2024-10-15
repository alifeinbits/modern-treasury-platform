package com.moderntreasury.counterparty.repository;

import com.moderntreasury.counterparty.model.Counterparty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CounterpartyRepository extends JpaRepository<Counterparty, UUID> {
}
