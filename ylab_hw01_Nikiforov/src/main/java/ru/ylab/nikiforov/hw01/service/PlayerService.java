package ru.ylab.nikiforov.hw01.service;

import ru.ylab.nikiforov.hw01.data.Player;

import java.math.BigDecimal;
import java.util.List;

public interface PlayerService {
    Player getPlayerById(Long id);
    List<Player> getAllPlayers();
    void createPlayer(Long id, BigDecimal balance);
    void updatePlayerBalance(Long id, BigDecimal newBalance);
    void deletePlayer(Long id);
}
