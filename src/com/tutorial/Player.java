package com.tutorial;

class Player {
    private static int numberOfPlayer;
    protected String name;
    protected int level;
    protected int health;
    protected int attack;
    protected boolean isAlive;

    protected Weapon weapon;
    protected Armor armor;

    Player(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.attack = 100;
        this.isAlive = true;

        Player.numberOfPlayer++;
        System.out.println("* Player Created");
    }

    Player () {
        Player.numberOfPlayer++;
        this.name = "Player" + numberOfPlayer;
        this.health = 100;
        this.level = 1;
        this.attack = 100;
        this.isAlive = true;

        Player.numberOfPlayer++;
        System.out.println("* Player Created");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) { this.health = health; }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void upLevel () {
        this.attack -= this.weapon.getAttackPower()*this.level;
        this.health -= this.armor.getHealthPower()*this.level;
        this.level++;
        this.attack += this.weapon.getAttackPower()*this.level;
        this.health += this.armor.getHealthPower()*this.level;

        System.out.println("* " + this.name + " level Up");
    }

    public void attack (Player opponent) {
        double attackPower = this.weapon.getAttackPower();
        System.out.println("* " +  this.name + " attacking " + opponent.name + " with " + attackPower + " power");
        opponent.defence(attackPower);
    }

    public void defence (double attackPower) {
        double damage;
        if (this.armor.getDefencePower() < attackPower) {
            damage = attackPower - this.armor.getDefencePower();
        } else {
            damage = 0;
        }

        this.health -= damage;

        if (this.health <= 0) {
            this.isAlive = false;
            System.out.println("* " +  this.name + " dead");
        }

        this.show();

    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.attack += weapon.getAttackPower()*this.level;
        System.out.println("* " + this.weapon.getName() + " equipped by " + this.name);
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
        this.health += armor.getHealthPower()*this.level;
        System.out.println("* " + this.armor.getName() + " equipped by " + this.name);
    }

    public void show() {
        System.out.println("\nPlayer Info -------------------------");
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Health\t\t: " + this.health);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Attack\t\t: " + this.attack);
        System.out.println("Status\t\t: " + (this.isAlive ? "Alive" : "Dead"));

        if (this.weapon != null) {
            System.out.println("Attack Power \t: " + this.attack + " (" + this.weapon.getName() + ")");
        }

        if (this.armor != null) {
            System.out.println("Defence Power \t: " + this.armor.getDefencePower() + " (" + this.armor.getName() + ")");
        }

        System.out.println("-------------------------------------");
        System.out.println();
    }
}