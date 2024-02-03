package com.abstraction;

public class HeroIntel extends Hero{
    public HeroIntel(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Where's ur brain, mf?");
    }

}
