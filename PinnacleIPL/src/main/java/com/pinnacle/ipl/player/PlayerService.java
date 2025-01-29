package com.pinnacle.ipl.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class PlayerService {

	 private Player player1 = new Player("P1", "MS Dhoni", "India", "Wicket-Keeper", "T1");
    private Player player2 = new Player("P2", "Rohit Sharma", "India", "Batsman", "T2");
    private Player player3 = new Player("P3", "Chris Gayle", "West Indies", "Batsman", "T3");
    private Player player4 = new Player("P4", "Andre Russell", "West Indies", "All-Rounder", "T4");

    private List<Player> players = new ArrayList<>(Arrays.asList(player1, player2, player3, player4));

    public List<Player> getAllPlayer() {
        return players;
    }

    public Player getPlayer(String id) {
        return players.stream()
                      .filter(player -> id.equals(player.getPlayerID()))
                      .findFirst()
                      .orElse(null);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayer(Player player, String id) {
        for (int i = 0; i < players.size(); i++) {
            Player existingPlayer = players.get(i);
            if (existingPlayer.getPlayerID().equals(id)) {
                players.set(i, player); 
                return;
            }
        }
    }

    public void deletePlayer(String id) {
        players.removeIf(player -> player.getPlayerID().equals(id));
    }
}


