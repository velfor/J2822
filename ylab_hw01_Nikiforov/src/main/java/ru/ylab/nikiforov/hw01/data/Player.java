package ru.ylab.nikiforov.hw01.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@NoArgsConstructor
@Getter
@Setter
public class Player {
    private final static String RUBLE_SYMBOL = "\u20BD";
    private Long id;
    private BigDecimal balance;

    public Player(Long id, BigDecimal amount){
        this.id = id;
        this.balance = amount;
        this.balance.setScale(2, RoundingMode.HALF_EVEN);
    }
    @Override
    public String toString() {
        return id + ": " + balance + RUBLE_SYMBOL;
    }
}
