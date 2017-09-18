package com.company;

public class Marine extends Soldier implements SecondaryWeapon {

    public Marine(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String fireGun() {
        return "bang-bang-bang";
    }

    @Override
    public String reloadGun() {
        return "Chick-chick";
    }

    @Override
    public String aim() {
        return "*zooming in sounds*";
    }

    @Override
    public String speak() {
        return "Hoo-Rah";
    }

    @Override
    public String makeABomb() {
        Bomb grenade = new Bomb();
        return grenade.toString();
    }

    @Override
    public void shootingDefaultMethod() {
        System.out.println("More specific default shooting");
    }
}
