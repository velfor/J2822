package ru.ylab.nikiforov.hw01.dao;

import ru.ylab.nikiforov.hw01.data.Player;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryPlayerRepository implements PlayerRepository {
    private Map<Long, Player> players = new HashMap<>();

    @Override
    public Player findById(Long id) {
        return players.get(id);
    }

    @Override
    public List<Player> findAll() {
        return new ArrayList<>(players.values());
    }

    @Override
    public void create(Long id, BigDecimal balance) {
        Player player = new Player(id, balance);
        players.put(id, player);
    }

    @Override
    public void updateBalance(Player player, BigDecimal newBalance) {
        player.setBalance(newBalance);
        players.put(player.getId(), player);
    }

    @Override
    public void delete(Player player) {
        players.remove(player.getId());
    }
}
