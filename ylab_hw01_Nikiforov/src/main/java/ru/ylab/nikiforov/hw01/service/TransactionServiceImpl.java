package ru.ylab.nikiforov.hw01.service;

import ru.ylab.nikiforov.hw01.data.Player;
import ru.ylab.nikiforov.hw01.data.Transaction;
import ru.ylab.nikiforov.hw01.data.TransactionType;
import ru.ylab.nikiforov.hw01.dao.TransactionRepository;

import java.math.BigDecimal;

public class TransactionServiceImpl implements TransactionService {
    private TransactionRepository transactionRepository;
    private PlayerService playerService;

    public TransactionServiceImpl(TransactionRepository transactionRepository, PlayerService playerService) {
        this.transactionRepository = transactionRepository;
        this.playerService = playerService;
    }

    @Override
    public void debit(Long playerId, BigDecimal amount) {
        Player player = playerService.getPlayerById(playerId);
        if (player != null) {
            BigDecimal currentBalance = player.getBalance();
            BigDecimal newBalance = currentBalance.subtract(amount);
            if (newBalance.compareTo(BigDecimal.ZERO) >= 0) {
                Transaction transaction = new Transaction(playerId, TransactionType.DEBIT, amount, player);
                transactionRepository.create(transaction);
                playerService.updatePlayerBalance(playerId, newBalance);
            }
        }
    }

    @Override
    public void credit(Long playerId, BigDecimal amount) {
        Player player = playerService.getPlayerById(playerId);
        if (player != null) {
            BigDecimal currentBalance = player.getBalance();
            BigDecimal newBalance = currentBalance.add(amount);
            Transaction transaction = new Transaction(playerId, TransactionType.CREDIT, amount, player);
            transactionRepository.create(transaction);
            playerService.updatePlayerBalance(playerId, newBalance);
        }
    }
}
