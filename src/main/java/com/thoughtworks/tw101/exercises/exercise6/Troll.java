package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster{

    private String name = "Troll";
    private int currentHealth = 40;

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
        currentHealth = currentHealth - (amount/2);
    }


}
