package lesson13.task3;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<Integer> display = x -> {
            x = (int) Math.pow(x, 2);

            if (x % 2 != 0) {
                x -= 5;
            }

            System.out.println(x);
        };


        display.accept(15);
        display.accept(35);
        display.accept(1);
        display.accept(0);

//        Consumer<String> displayWord = x -> System.out.println(x);
        Consumer<String> displayWord = System.out::println;

        displayWord.accept("Hello");
        displayWord.accept("World");
    }
}
