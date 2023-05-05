package lesson9.task2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        Student student1 = new Student(12, "Иван", "Иванов", 5, 4.53);
        Student student2 = new Student(59, "Пётр", "Петров", 2, 4.23);
        Student student3 = new Student(2, "Сидор", "Сидоров", 1, 4.32);
        Student student4 = new Student(9, "Иван", "Петров", 3, 4.63);
        Student student5 = new Student(23, "Сергей", "Александров", 3, 4.63);
        Student student6 = new Student(15, "Сергей", "Иванов", 4, 3.39);
        Student student7 = new Student(1, "Александр", "Петров", 1, 4.87);
        Student student8 = new Student(5, "Иван", "Иванов", 5, 3.10);
        Student student9 = new Student(3, "Иван", "Иванов", 2, 4.40);
        Student student10 = new Student(34, "Александр", "Сидоров", 4, 3.22);
        Student student11 = new Student(34, "Александр", "Сидоров", 4, 3.22);

        SortedSet<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);

        for (Student student : students) {
            System.out.println("Id: " + student.getId() + ", Name: " + student.getName() +
                    ", Surname: " + student.getSurname() + ", Course: " + student.getCourse() +
                    ", Average Rate: " + student.getAverageRate());
        }
    }
}
