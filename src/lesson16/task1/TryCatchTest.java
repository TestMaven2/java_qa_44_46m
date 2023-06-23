package lesson16.task1;

public class TryCatchTest {

    public static void main(String[] args) {

        System.out.println(div(6, 0));

        System.out.println("Конец работы программы");
    }

    public static int div(int x, int y) {
        int result = -1;
        try {
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Возникла ошибка в методе div");
        } finally {
            System.out.println("Отработал блок finally");
        }
        return result;
    }
}
