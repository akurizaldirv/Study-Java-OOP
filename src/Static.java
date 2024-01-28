import java.util.ArrayList;

public class Static {
    private static int numberOfStatic;
    private static ArrayList<String> nameOfStatic = new ArrayList<String>();
    private String name;

    Static (String name) {
        this.name = name;
        Static.numberOfStatic++;
        Static.nameOfStatic.add(name);
    }

    void show () {
        System.out.println("Object name : " + this.name);
    }

    static void showNumberOfStatic () {
        System.out.println(numberOfStatic);
    }
    static void showNameOfStatic () {
        System.out.println(Static.nameOfStatic);
    }
}

class StaticMain {
    public static void main(String[] args) {
        Static object1 = new Static("Aldi");
        Static object2 = new Static("Budi");
        Static object3 = new Static("Tata");

        Static.showNumberOfStatic();
        Static.showNameOfStatic();
    }
}
