package lesson10.task1;

public class PrimitiveComparing {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 20;
        boolean result = num1 == num2;
        System.out.println("Result: " + result);

        int num3 = 15;
        Integer num4 = 15;
        boolean result1 = num3 == num4;
        System.out.println("Result: " + result1);

        Integer num5 = new Integer(25);
        Integer num6 = new Integer(25);
        boolean result2 = num5 == num6;
        System.out.println("Result: " + result2);
    }
}