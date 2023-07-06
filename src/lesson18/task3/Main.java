package lesson18.task3;

import lesson16.task4.Cat;

public class Main {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        Box<Cat> box2 = new Box<>();

        box1.putItem("Hello");
        box2.putItem(new Cat(3, "", 7));


    }
}
