package lesson14.task8;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

    /* Задача на интерфейс Function
        Написать функцию, которая в качестве входящего
        параметра принимает объект Request, а возвращает
        строку в виде "{Sender id: %id, message: %message"}"
        Вместо %s и %message необходимо подставить значения
        идентификатора и самого сообщения.
         */

        Function<Request, String> result = x -> String.format("{Sender id: %d, message: %s}", x.getSenderId(), x.getMessage());
        System.out.println(result.apply(new Request("Hello", 1)));
    }
}