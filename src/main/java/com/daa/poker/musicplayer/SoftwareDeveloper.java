package com.daa.poker.musicplayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoftwareDeveloper extends Person {

    List<ProgammingLanguage> progammingLanguages;

    public SoftwareDeveloper(String name) {
        super(name);
        progammingLanguages = new ArrayList<>();
    }

    public List<ProgammingLanguage> getProgammingLanguages() {
        return progammingLanguages;
    }

    public void setProgammingLanguages(List<ProgammingLanguage> progammingLanguages) {
        this.progammingLanguages = progammingLanguages;
    }

    public void addProgammingLanguage(ProgammingLanguage progammingLanguage) {
        this.progammingLanguages.add(progammingLanguage);
    }

    public void addProgammingLanguages(List<ProgammingLanguage> progammingLanguages) {
        for(int i= 0; i< progammingLanguages.size(); i++) {
            addProgammingLanguage(progammingLanguages.get(i));
        }
    }
    public void addAllProgrammingLanguages() {
        List<ProgammingLanguage> progammingLanguages = Arrays.asList(ProgammingLanguage.values());
        for(int i = 0; i < progammingLanguages.size() ; i++) {
            addProgammingLanguage(progammingLanguages.get(i));
        }
    }


    @Override
    public String toString() {
        return "SoftwareDeveloper{" +
                "progammingLanguages=" + progammingLanguages +
                "\n" +
                "name =" + name +
                '}';
    }
}
