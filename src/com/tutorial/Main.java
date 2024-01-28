package com.tutorial;

class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Aldi");

        Weapon sword = new Weapon("Sword", 40);
        Armor shield = new Armor("Shield", 20, 20);

        player1.equipWeapon(sword);
        player1.equipArmor(shield);

        player1.show();

        Player player2 = new Player("Budi");

        Weapon pistol = new Weapon("Pistol", 60);
        Armor tuxedo = new Armor("Tuxedo", 10, 20);

        player2.equipWeapon(pistol);
        player2.equipArmor(tuxedo);

        player2.show();

        player2.upLevel();
        player1.upLevel();

        player2.show();
        player1.show();

        System.out.println("=========== PERTEMPURAN ===========");
        System.out.println("\nEpisode - 1");
        player1.attack(player2);

        player2.show();
        player1.show();

        System.out.println("\nEpisode - 2");
        player2.attack(player1);

        player2.show();
        player1.show();


        Player player3 = new Player();
    }
}