package com.tutorial;

class Buku {
    String title; // default to public
    public String author; // accessible by outside class
    private int year; // inaccessible by outside class

    Buku (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

//    just like the properties, default method will be set to public
    void displayYear () {
//        private method inaccessible outside class
        System.out.println("Year : " +this.year);
        this.upYear();
    }

//    private method, inaccessible from outside class
    private void upYear () {
        this.year += 1;
    }
}

public class PublicPrivate {
    public static void main(String[] args) {
        Buku dataBuku = new Buku("Dunia Sophie", "Jostein Gaarder", 1996);

//        default, can read and write outside class
        System.out.println(dataBuku.title);
        dataBuku.title = "Sophie's World";
        System.out.println(dataBuku.title);

//        public, can read and write outside class
        System.out.println();
        System.out.println(dataBuku.author);
        dataBuku.author = "G. Josten";
        System.out.println(dataBuku.author);

//        private, cannot read and write outside class
//        System.out.println(dataBuku.year);
//        dataBuku.year = 96;
//        System.out.println(dataBuku.year);

//        to access private value, should be inside it class
//        and outsider should access it by method
        dataBuku.displayYear();

//        private method, inaccessible
//        dataBuku.upYear();

        dataBuku.displayYear();
        dataBuku.displayYear();




    }
}
