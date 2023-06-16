package lesson15.task1;

import lesson2.Cat;

import java.util.Date;

public class FormattedOutTest {

    public static void main(String[] args) {

        // %n - служебный символ переноса строки
        System.out.printf("One%nTwo%nThree");
        System.out.println();

        // метод println не умеет работать с такими служебными символами
        System.out.println("One%nTwo%nThree");

        // %b - подстановка boolean переменной либо другого типа
        // при этом отсутствие в переданной переменной
        // ссылки на объект (null)
        // преобразуется в false
        Cat cat = null;
        System.out.printf("%b%n", cat);
        cat = new Cat();
        System.out.printf("%b%n", cat);

        boolean b = true;
        System.out.printf("%B%n", b);
        b = false;
        System.out.printf("%B%n", b);

        System.out.printf("%b%n", 5);
        System.out.printf("%B%n", "Hello");

        // %s - служит для подстановки в строку другой строки
        System.out.printf("[Строка - %s]%n", "Hello guys!");
        System.out.printf("[Строка - %.5s]%n", "Hello guys!");

        // %c - служит для подстановки в строку символа
        System.out.printf("[Символ - %c]%n", 'a');
        System.out.printf("[Символ - %C]%n", 'a');

        // %d - служит для подстановки целочисленного значения в строку
        int x = 100;
        System.out.printf("[Число - %d]%n", x);

        // %f - служит для подстановки дробного значения в строку
        // При этом мы можем ограничивать число знаков после запятой,
        // а также необходимый отступ слева
        double pi = Math.PI;
        System.out.printf("[Число ПИ - %f]%n", pi);
        System.out.printf("[Округлённое число ПИ - %.3f]%n", pi);
        System.out.printf("%50.3f%n", pi);
        System.out.printf("%50f%n", pi);

        // В момент создания объекта Date в него заносится текущее время и дата
        Date currentDate = new Date();
        System.out.println(currentDate);

        // %t отвечает за подстановку даты в строку
        // T - подстановка времени из текущего объекта даты
        System.out.printf("%tT%n", currentDate);

        // H - часы, M - минуты, S - секунды
        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS %n", currentDate, currentDate, currentDate);

        // A - день недели, d - день месяца, B - месяц, Y - год
        // Конструкция 1$ позволяет нам указать номер переменной по порядку,
        // к которой мы обращаемся
        System.out.printf("Текущая дата - %1$tA, %1$td %1$tB %1$tY года %n", currentDate);
    }
}
