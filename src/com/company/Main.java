package com.company;

public class Main {

    public static void main(String[] args) {
	Monkey monkey = new Monkey("acordian", "Bob");
    Dancer person = new Dancer ("Ronald Regin");

    monkey.startDance();
    monkey.moveBody("Arm", "Left");
    monkey.stopDancing();

    person.startDance();
    person.moveBody("Leg", "Right");
    person.stopDancing();

    }
}
