package com.tutorial;

class Armor {
    private String name;
    private double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    public String getName () {
        return this.name;
    }

    public double getDefencePower() {
        return this.defencePower;
    }

    void display() {
        System.out.println("com.tutorial.Armor : " + this.name + ", Attack Power : +" + this.defencePower);
    }
}