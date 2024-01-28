package com.tutorial;

public class Reference {
    public static void main(String[] args) {
        Player player1 = new Player("Aldi");
        System.out.println(Integer.toHexString(System.identityHashCode(player1)));

//        Copying com.tutorial.Reference
        Player player2 = player1;
        player2.show();
        System.out.println(Integer.toHexString(System.identityHashCode(player2)));

//        Set player 2 name, autoset in player 1
        player2.setName("Auto Complete");
        player2.show();
        player1.show();
    }
}
