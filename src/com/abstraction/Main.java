package com.abstraction;

public class Main {
    public static void main(String[] args) {

        //    non-abstract method
        HeroIntel hero1 = new HeroIntel("Aldi");
        hero1.display();
        hero1.makeSound();

        System.out.println();

        HeroAgility hero2 = new HeroAgility("Budi");
        hero2.display();
        hero2.makeSound();
//        abstract
//        Hero hero2 = new Hero("Budi");
//        hero2.dislay();
    }

//
}