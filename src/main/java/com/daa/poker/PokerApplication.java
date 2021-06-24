package com.daa.poker;

import com.daa.poker.game.Game;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PokerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Game game = new Game();
        game.startGame();

        while (!game.gameIsOver()) {

            System.out.println("NEXT MOVE");
        }
    }
}
