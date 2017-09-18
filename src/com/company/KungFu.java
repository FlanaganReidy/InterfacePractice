package com.company;

public interface KungFu {
    public String karateChop();
    public String flyingKick();
    public String dodgeFlip();
    default String shootingDefaultMethod(){
        return "We're in the default";
    }
}
