package com.moderntreasury.ledger.controller;

import com.moderntreasury.ledger.model.LedgerAccount;
import com.moderntreasury.ledger.repository.LedgerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ledger_accounts")
public class LedgerAccountController {

    @Autowired
    private LedgerAccountRepository ledgerAccountRepository;

    @PostMapping
    public ResponseEntity<LedgerAccount> createLedgerAccount(@RequestBody LedgerAccount ledgerAccount) {
        return ResponseEntity.ok(ledgerAccountRepository.save(ledgerAccount));
    }

    @GetMapping("/{id}")
    public ResponseEntity<LedgerAccount> getLedgerAccount(@PathVariable UUID id) {
        return ledgerAccountRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<LedgerAccount>> listLedgerAccounts() {
        return ResponseEntity.ok(ledgerAccountRepository.findAll());
    }
}
