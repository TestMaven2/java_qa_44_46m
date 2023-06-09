package lesson14.task1;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Функция, которая принимает Double, округляет и возращает Long
        Function<Double, Long> function = x -> Math.round(x);
        System.out.println(function.apply(4.56));
    }
}
