package lesson2;

public abstract class Animal {

    public boolean canEat;

    public Animal() {
        canEat = true;
        System.out.println("Вызван конструктор Animal");
    }

    private String name = "Животное";

    public void printInfo() {
        System.out.println("Это животное.");
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public static void getInfo() {
        System.out.println("Все животные живут на планете Земля.");
    }
}
