package ru.ylab.nikiforov.hw01.service;

import ru.ylab.nikiforov.hw01.data.Player;
import ru.ylab.nikiforov.hw01.dao.PlayerRepository;

import java.math.BigDecimal;
import java.util.List;

public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public void createPlayer(Long id, BigDecimal balance) {
        playerRepository.create(id, balance);
    }

    @Override
    public void updatePlayerBalance(Long id, BigDecimal newBalance) {
        Player player = playerRepository.findById(id);
        if (player != null) {
            playerRepository.updateBalance(player, newBalance);
        }
    }

    @Override
    public void deletePlayer(Long id) {
        Player player = playerRepository.findById(id);
        if (player != null) {
            playerRepository.delete(player);
        }
    }
}
