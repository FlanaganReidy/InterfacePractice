package com.company;

public interface Shooting {
    public String fireGun();
    public String reloadGun();
    public String aim();
    default String shootingDefaultMethod(){
        return "We're in the default";
    }
}
