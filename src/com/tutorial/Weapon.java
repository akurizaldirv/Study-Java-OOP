package com.tutorial;

class Weapon {
    private String name;
    private double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName () {
        return this.name;
    }

    public double getAttackPower () {
        return this.attackPower;
    }

    void display() {
        System.out.println("com.tutorial.Weapon : " + this.name + ", Attack Power : +" + this.attackPower);
    }
}