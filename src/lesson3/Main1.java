package lesson3;

import lesson2.Cat;

public class Main1 {

    public static void main(String[] args) {
        Day day = Day.FRIDAY;

//        Cat cat = new Cat();

        System.out.println(day);
        System.out.println(day.getValue());

        Day day1 = Day.valueOf("WEDNESDAY");
        System.out.println(day1.getValue());

        System.out.println(day1.ordinal());
    }
}
