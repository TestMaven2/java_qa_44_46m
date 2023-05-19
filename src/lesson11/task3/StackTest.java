package lesson11.task3;

public class StackTest {

    public static void main(String[] args) {
        first();
    }

    public static void first() {
        second();
    }

    public static void second() {
        third();
    }

    public static void third() {
        fourth();
        throw new RuntimeException();
    }

    public static void fourth() {
        System.out.println("Отработал четвёртый метод");
    }
}
