package lesson4.task3;

import lesson4.task2.Person;

public class BoxingTest {

    public static void main(String[] args) {

        Integer integer = new Integer(12);

        // Создание объекта с помощью автоупаковки.
        Integer objectInt = 12;

        // Автораспаковка.
//        int primitiveInt = objectInt;

        int primitive = objectInt.intValue();

        // Автораспаковка
        int i = integer;

        double d = 2.5;

        // Автоупаковка
        Double doub = d;

        Person person = new Person(8);
    }
}
