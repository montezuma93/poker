package com.daa.poker.service;

import com.daa.poker.domain.Game;
import com.daa.poker.domain.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    protected Game game;

    GameService() {}

    public void addPlayer(String name) {
        Player player = new Player(name);
        this.game.addPlayer(player);
    }

    public String getAllPlayers() {
        return this.game.getPlayers().stream().map(it -> it.name).collect(Collectors.joining(","));
    }


}
