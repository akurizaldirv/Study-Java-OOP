public class Main {
    public static void main(String[] args) {
        Player aldi = new Player("Aldi", 100, 1);

        Weapon sword = new Weapon("Sword", 20);
        Armor shield = new Armor("Shield", 20);

        aldi.equipWeapon(sword);
        aldi.equipArmor(shield);

        aldi.show();

        Player budi = new Player("Budi", 50, 1);

        Weapon pistol = new Weapon("Pistol", 30);
        Armor tuxedo = new Armor("Tuxedo", 10);

        budi.equipWeapon(pistol);
        budi.equipArmor(tuxedo);

        budi.show();

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