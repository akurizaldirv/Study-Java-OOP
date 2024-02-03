package com.abstraction.latihan;

public abstract class Hero {
    private String name;
    private Integer health;
    private IAttackSkill attackSkill;

    public Hero(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setAttackSkill(IAttackSkill attackSkill) {
        this.attackSkill = attackSkill;
    }

    public void attack(Hero enemy) {
        this.attackSkill.attack(enemy);
    }

    public void display () {
        System.out.println("Name\t: " + this.name);
        System.out.println("Health\t: " + this.health);
    }
}
