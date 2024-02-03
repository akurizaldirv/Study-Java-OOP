package com.abstraction;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public void display () {
        System.out.println("Halo, nama saya " + this.name);
    }
}
