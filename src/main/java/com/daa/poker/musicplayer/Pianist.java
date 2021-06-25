package com.daa.poker.musicplayer;

public class Pianist extends MusicPlayer {

    public Pianist(String name) {
        super(name);
    }

    @Override
    public void play() {
        this.getInstrument().play();
    }

    @Override
    public boolean isAbleToPlayBlues() {
        return true;
    }

    @Override
    public boolean isAbleToPlayJazz() {
        return false;
    }
}
