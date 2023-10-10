package ru.ylab.nikiforov.hw01.service;

import java.math.BigDecimal;

public interface TransactionService {
    void debit(Long playerId, BigDecimal amount);
    void credit(Long playerId, BigDecimal amount);
}
