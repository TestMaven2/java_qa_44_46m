package lesson9.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Circle circle = new Circle(5, "Green");
        System.out.println(circle.getRadius());
        System.out.println(circle.getLength());

        circle.setLength(20);
        System.out.println(circle.getRadius());

        Set<Circle> circles = new HashSet<>();

        Circle circle1 = new Circle(10, "Black");
        Circle circle2 = new Circle(7, "Green");
        Circle circle3 = new Circle(12, "Red");
        Circle circle4 = new Circle(15, "Yellow");
        Circle circle5 = new Circle(10, "Black");
        Circle circle6 = new Circle(20, "Blue");

        circles.add(circle);
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);
        circles.add(circle5);
        circles.add(circle6);

        System.out.println(circle1.hashCode());
        System.out.println(circle5.hashCode());

        System.out.println(circle1.equals(circle5));

        for (Circle c : circles) {
            System.out.println("Radius: " + c.getRadius() + ", Color: " + c.getColor());
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(3);
        integerList.add(7);
        integerList.add(7);

        System.out.println("List: " + integerList);

        Set<Integer> integerSet = new HashSet<>(integerList);

        System.out.println("Set: " + integerSet);

        Set<String> stringSet = new HashSet<>(20);

        Set<String> stringSet1 = new HashSet<>(20, 0.9f);

        Set<Integer> testSet = new HashSet<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 50_000_000; i++) {
            testSet.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Milliseconds: " + (end - start));

    }
}
