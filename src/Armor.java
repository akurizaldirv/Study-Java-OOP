class Armor {
    String name;
    double defencePower;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", Attack Power : +" + this.defencePower);
    }
}