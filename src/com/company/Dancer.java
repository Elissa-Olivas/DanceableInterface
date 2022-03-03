package com.company;

public class Dancer implements Danceable{
    private String name; //persons name

    public Dancer (String name) {
        this.name = name;
    }

    public void startDance() {
    System.out.println(name + " is starting to dance");
    }

    public void moveBody(String bodyPart, String direction) {
    System.out.println("Shake your " + bodyPart + " to the " + direction);
    }

    public void stopDancing() {
    System.out.println(name + " is no longer dancing");
    }
}
