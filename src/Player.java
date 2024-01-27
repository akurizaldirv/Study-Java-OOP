class Player {
    private String name;
    private int health;
    private int level;

    private Weapon weapon;
    private Armor armor;

    Player(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;

        System.out.println("Player Created");
        this.show();
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

    void attack (Player opponent) {
        double attackPower = this.weapon.getAttackPower();
        System.out.println("* " +  this.name + " attacking " + opponent.name + " with " + attackPower + " power");
        opponent.defence(attackPower);
    }

    void defence (double attackPower) {
        double damage;
        if (this.armor.getDefencePower() < attackPower) {
            damage = attackPower - this.armor.getDefencePower();
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
        System.out.println("* " + this.weapon.getName() + " equipped by " + this.name);
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println("* " + this.armor.getName() + " equipped by " + this.name);
    }

    void show() {
        System.out.println("\nPlayer Info -------------------------");
        System.out.println("Name\t\t: " + this.name);
        System.out.println("Health\t\t: " + this.health);
        System.out.println("Level\t\t: " + this.level);

        if (this.weapon != null) {
            System.out.println("Attack Power \t: " + this.weapon.getAttackPower() + " (" + this.weapon.getName() + ")");
        }

        if (this.armor != null) {
            System.out.println("Defence Power \t: " + this.armor.getDefencePower() + " (" + this.armor.getName() + ")");
        }

        System.out.println("-------------------------------------");
        System.out.println();
    }
}