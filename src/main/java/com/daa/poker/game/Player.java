package com.daa.poker.game;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

public class Player {

    public int START_MONEY = 100;

    List<String> cards;
    public String name;
    int money;

    public Player(String name) {
        this.name = name;
        this.money = START_MONEY;
        this.cards = Collections.emptyList();
    }


}
