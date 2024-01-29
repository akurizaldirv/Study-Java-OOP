package com.tutorial;

public class Barbarian extends Player {
    Barbarian() {
        super();
        super.setHealth(150);
        super.setAttack(90);
    }

    Barbarian(String name) {
        super(name);
        super.setHealth(150);
        super.setAttack(90);
    }

    @Override
    public void defence(double attackPower) {
        double damage;
        if (this.armor.getDefencePower() < attackPower) {
            damage = attackPower - this.armor.getDefencePower();
        } else {
            damage = 0;
        }

        this.health -= 0.5*damage;
        System.out.println("* " + this.name + " receiving half damage");

        if (this.health <= 0) {
            this.isAlive = false;
            System.out.println("* " + this.name + " dead");
        }

        this.show();

    }
}
