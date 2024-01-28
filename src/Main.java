public class Main {
    public static void main(String[] args) {
        Player aldi = new Player("Aldi");

        Weapon sword = new Weapon("Sword", 40);
        Armor shield = new Armor("Shield", 20, 20);

        aldi.equipWeapon(sword);
        aldi.equipArmor(shield);

        aldi.show();

        Player budi = new Player("Budi");

        Weapon pistol = new Weapon("Pistol", 60);
        Armor tuxedo = new Armor("Tuxedo", 10, 20);

        budi.equipWeapon(pistol);
        budi.equipArmor(tuxedo);

        budi.show();

        budi.upLevel();
        aldi.upLevel();

        budi.show();
        aldi.show();

        System.out.println("=========== PERTEMPURAN ===========");
        System.out.println("\nEpisode - 1");
        aldi.attack(budi);

        budi.show();
        aldi.show();

        System.out.println("\nEpisode - 2");
        budi.attack(aldi);

        budi.show();
        aldi.show();
    }
}