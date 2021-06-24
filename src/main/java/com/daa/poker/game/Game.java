package com.daa.poker.game;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class Game {

    List<Player> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public boolean gameIsOver() {
        //TODO
        return false;
    }

    public void startGame() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amout of player: ");
        int amountOfPlayer = Integer.parseInt(in.nextLine());
        for(int i = 0; i<amountOfPlayer; i++){
            System.out.print("Please enter the name of the player: ");
            String playerName = in.nextLine();
            Player player = new Player(playerName);
            addPlayer(player);
        }
    }

    public void handOutCards() {
        //TODO
    }
}
