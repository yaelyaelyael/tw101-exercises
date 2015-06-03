package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster{

    private String name = "Orc";
    private int currentHealth = 20;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCurrentHitPoints() {
        return currentHealth;
    }

    @Override
    public void takeDamage(int amount) {
        currentHealth = currentHealth - amount;
    }


}
