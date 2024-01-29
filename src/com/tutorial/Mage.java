package com.tutorial;

public class Mage extends Player{
    Mage () {
        super();
        super.setHealth(80);
        super.setAttack(110);
    }

    Mage (String name) {
        super(name);
        super.setHealth(80);
        super.setAttack(110);
    }

    public void attack (Player opponent) {
        double attackPower = 1.2*this.weapon.getAttackPower();
        System.out.println("* " +  this.name + " attacking " + opponent.name + " with 120% of " + attackPower + " power");
        opponent.defence(attackPower);
    }
}
