package com.daa.poker.musicplayer;

public class Guitarist extends MusicPlayer {

    public Guitarist(String name) {
      super(name);
    }

    @Override
    public void play() {
        this.getInstrument().play();
    }

    @Override
    public boolean isAbleToPlayBlues() {
        return false;
    }

    @Override
    public boolean isAbleToPlayJazz() {
        return false;
    }
}
