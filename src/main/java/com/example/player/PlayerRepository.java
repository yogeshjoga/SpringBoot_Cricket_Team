// Write your code here

package com.example.player;

import com.example.player.Player;
import java.util.ArrayList;

public interface PlayerRepository {

    // Player player = new Player();

    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

    Player getPlayer(int playerId);

    Player updatePlayer(Player player, int playerId);

    void deletePlayer(int playerId);

}