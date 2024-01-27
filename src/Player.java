class Player {
    String name;
    int health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;

        System.out.println("Player Created");
        this.show();
    }

    void attack (Player opponent) {
        double attackPower = this.weapon.attackPower;
        System.out.println("* " +  this.name + " attacking " + opponent.name + " with " + attackPower + " power");
        opponent.defence(attackPower);
    }

    void defence (double attackPower) {
        double damage;
        if (this.armor.defencePower < attackPower) {
            damage = attackPower - armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;

        if (this.health < 1) {
            System.out.println("* " +  this.name + " dead");
        } else {
            System.out.println("* " +  this.name + " gets damage " + damage);
        }
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println("* " + this.weapon.name + " equipped by " + this.name);
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println("* " + this.armor.name + " equipped by " + this.name);
    }

    void show() {
        System.out.println("\nPlayer Info -------------------------");
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Health\t\t: " + this.health);
        System.out.println("Level\t\t: " + this.level);

        if (this.weapon != null) {
            System.out.println("Attack Power \t: " + this.weapon.attackPower + " (" + this.weapon.name + ")");
        }

        if (this.armor != null) {
            System.out.println("Defence Power \t: " + this.armor.defencePower + " (" + this.armor.name + ")");
        }

        System.out.println("-------------------------------------");
        System.out.println();
    }
}