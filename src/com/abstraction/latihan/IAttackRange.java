package com.abstraction.latihan;

public class IAttackRange implements IAttackSkill{

    private Integer power;

    public IAttackRange(Integer power) {
        this.power = power;
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("attack " + enemy.getName() + " with Range : " + this.power + " Power");
    }
}
