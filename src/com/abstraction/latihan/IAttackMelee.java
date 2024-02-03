package com.abstraction.latihan;

public class IAttackMelee implements IAttackSkill {
    private Integer power;

    public IAttackMelee(Integer power) {
        this.power = power;
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Attack " + enemy.getName() + " with Melee by " + this.power + " Power");
    }
}
