package com.daa.poker;

import com.daa.poker.game.Game;
import com.daa.poker.musicplayer.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class PokerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PokerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        SoftwareDeveloper otto = new SoftwareDeveloper("otto");

        otto.addProgammingLanguage(ProgammingLanguage.PYTHON);
        otto.addProgammingLanguage(ProgammingLanguage.CPP);

        otto.setProgammingLanguages(new ArrayList<>(Arrays.asList(ProgammingLanguage.C_SHARP, ProgammingLanguage.JAVA)));

        System.out.println(otto);


        /*
        Game game = new Game();
        game.startGame();

        while (!game.gameIsOver()) {

            System.out.println("NEXT MOVE");
        }
        */
    }
}
