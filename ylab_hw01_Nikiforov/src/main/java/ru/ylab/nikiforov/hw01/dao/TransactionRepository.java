package ru.ylab.nikiforov.hw01.dao;

import ru.ylab.nikiforov.hw01.data.Transaction;

import java.util.List;

public interface TransactionRepository {
    Transaction findById(Long id);
    List<Transaction> findAll();
    void create(Transaction transaction);
}
