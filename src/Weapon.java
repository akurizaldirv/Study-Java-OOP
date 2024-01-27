class Weapon {
    String name;
    double attackPower;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", Attack Power : +" + this.attackPower);
    }
}