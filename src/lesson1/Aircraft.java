package lesson1;

import lesson2.Flyable;

public class Aircraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолёт летит");
    }
}
