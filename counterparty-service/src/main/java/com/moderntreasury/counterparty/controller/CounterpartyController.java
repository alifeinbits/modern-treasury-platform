package com.moderntreasury.counterparty.controller;

import com.moderntreasury.counterparty.model.Counterparty;
import com.moderntreasury.counterparty.repository.CounterpartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/counterparties")
public class CounterpartyController {

    @Autowired
    private CounterpartyRepository counterpartyRepository;

    @PostMapping
    public ResponseEntity<Counterparty> createCounterparty(@RequestBody Counterparty counterparty) {
        return ResponseEntity.ok(counterpartyRepository.save(counterparty));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Counterparty> getCounterparty(@PathVariable UUID id) {
        return counterpartyRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Counterparty>> listCounterparties() {
        return ResponseEntity.ok(counterpartyRepository.findAll());
    }
}
