package com.daa.poker.musicplayer;

public abstract class MusicPlayer extends Person implements BluesPlayer, JazzPlayer {

    Instrument instrument;

    MusicPlayer(String name) {
        super(name);
    }

    Instrument getInstrument() {
        return this.instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    void play() {
        System.out.println("Sing sing");
    }
}
