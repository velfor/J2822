package ru.ylab.nikiforov.hw01.dao;

import ru.ylab.nikiforov.hw01.data.Player;
import java.math.BigDecimal;
import java.util.List;


public interface PlayerRepository {
    Player findById(Long id);
    List<Player> findAll();
    void create(Long id, BigDecimal balance);
    void updateBalance(Player player, BigDecimal newBalance);
    void delete(Player player);
}
