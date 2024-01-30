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
        if (this.getArmor().getDefencePower() < attackPower) {
            damage = attackPower - this.getArmor().getDefencePower();
        } else {
            damage = 0;
        }

        this.setHealth((int) (this.getHealth() - 0.5*damage));
        System.out.println("* " + this.getName() + " receiving half damage");

        if (this.getHealth() <= 0) {
            this.setAlive(false);
            System.out.println("* " + this.getName() + " dead");
        }

        this.show();

    }
}
