package com.company;

public interface SecondaryWeapon extends Shooting   {

    @Override
    String fireGun();

    @Override
    String reloadGun();

    @Override
    String aim();

    String makeABomb();
}
