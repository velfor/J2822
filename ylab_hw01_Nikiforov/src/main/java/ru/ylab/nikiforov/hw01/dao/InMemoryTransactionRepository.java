package ru.ylab.nikiforov.hw01.dao;

import ru.ylab.nikiforov.hw01.data.Transaction;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTransactionRepository implements  TransactionRepository{
    private List<Transaction> transactions;



    @Override
    public Transaction findById(Long id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId().equals(id)) {
                return transaction;
            }
        }
        return null;
    }

    @Override
    public List<Transaction> findAll() {
        return new ArrayList<>(transactions);
    }

    @Override
    public void create(Transaction transaction) {
        transactions.add(transaction);
    }
}
