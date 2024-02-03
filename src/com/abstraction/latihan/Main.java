package com.abstraction.latihan;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new HeroAgility("Boboiboy", 100);
        Hero hero2 = new HeroAgility("Fang", 100);

        hero1.setAttackSkill(new IAttackMelee(100));
        hero2.setAttackSkill(new IAttackRange(50));

        hero1.display();
        System.out.println("---");
        hero2.display();

        System.out.println();
        hero1.attack(hero2);
        hero2.attack(hero1);
        System.out.println("---");
    }
}
