class Armor {
    private String name;
    private double defencePower;
    private double healthPower;

    Armor(String name, double defencePower, double healthPower) {
        this.name = name;
        this.defencePower = defencePower;
        this.healthPower = healthPower;
    }

    public double getHealthPower() {
        return healthPower;
    }

    public String getName () {
        return this.name;
    }

    public double getDefencePower() {
        return this.defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", Attack Power : +" + this.defencePower);
    }
}