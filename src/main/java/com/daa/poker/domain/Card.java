package com.daa.poker.domain;

public class Card {

    final Color color;
    final Number number;


    Card(Number number, Color color) {
        this.number = number;
        this.color = color;
    }

}