package ru.ylab.nikiforov.hw01.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    private Long id;
    private TransactionType type;
    private BigDecimal amount;
    private Player player;
}
