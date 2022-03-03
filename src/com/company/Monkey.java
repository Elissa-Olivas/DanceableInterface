package com.company;

public class Monkey implements Danceable {
    private String instrument;
    private String nameOfMonkey;


    public Monkey(String instrument, String nameOfMonkey) {
        this.instrument = instrument;
        this.nameOfMonkey = nameOfMonkey;
    }


    public void startDance() {
        System.out.println(nameOfMonkey + " play your " + instrument);
    }

    public void moveBody(String bodyPart, String direction) {
        System.out.println(nameOfMonkey + " move your " + bodyPart + " to the " + direction);
    }

    public void stopDancing() {
        System.out.println(nameOfMonkey + " stop playing your " + instrument + "!");
    }
}
