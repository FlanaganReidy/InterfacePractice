package com.company;

public class Ninja extends Soldier implements KungFu {

    public Ninja(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String karateChop() {
        return "Watchaa!!!";
    }

    @Override
    public String flyingKick() {
        return "Hyaaaaa!!!";
    }

    @Override
    public String dodgeFlip() {
        return "Whoosh!!!";
    }

    @Override
    public String speak() {
        return "Stick to the shadows";
    }
}
