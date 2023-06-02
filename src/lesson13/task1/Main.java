package lesson13.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //        Filter filter = new StudentFilter();
        //        Filter filter1 = new AnotherFilter();

        List<String> names = Arrays.asList("Дмитрий", "Александра", "Екатерина");

        List<Student> students = new ArrayList<>();

        students.add(new Student("Александра", 19, Gender.FEMALE, 123, 4.87));
        students.add(new Student("Денис", 21, Gender.MALE, 125, 4.34));
        students.add(new Student("Владимир", 18, Gender.MALE, 114, 4.54));
        students.add(new Student("Екатерина", 23, Gender.FEMALE, 101, 4.21));
        students.add(new Student("Дмитрий", 22, Gender.MALE, 145, 3.87));
        students.add(new Student("Валерия", 17, Gender.FEMALE, 158, 3.98));
        students.add(new Student("Николай", 25, Gender.MALE, 118, 4.11));

        System.out.println("Фильтр при помощи объекта StudentFilter");
        StudentUtils.filter(students, new StudentFilter());
        System.out.println();

        System.out.println("Фильтр при помощи объекта AnotherFilter");
        StudentUtils.filter(students, new AnotherFilter());
        System.out.println();

        System.out.println("Фильтр при помощи анонимного класса");
        StudentUtils.filter(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return names.contains(student.getName()) && student.getGroup() > 110;
            }
        });
        System.out.println();

        // Женщины, возраст больше 20, балл больше 4
        System.out.println("Фильтр при помощи лямбда-выражения");
        StudentUtils.filter(students, x -> x.getGender().equals(Gender.FEMALE)
                && x.getAge() > 20 && x.getAverageRate() > 4);
    }
}