package com.tutorial;

// import a whole class
import com.terminal.Console;

// import only 1 static method
import static com.terminal.Console.log;

class Package {
    public static void main(String[] args) {
        Console.log("Hello, this is called by different package!");
        log("This is static log");
    }
}
