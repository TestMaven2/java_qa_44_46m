package lesson13.task2;

public class Utils {

    public static void print(String word, int count, Operation op) {
        System.out.println(op.operation(word, count));
    }

    public static void callMethod(String word, int count, Operation oper) {
        System.out.println("Вызываем метод, переданный в метод");
        System.out.println(oper.operation(word, count));
        System.out.println("Вызов метода успешно произведён");
    }
}