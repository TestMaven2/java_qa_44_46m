package lesson13.task1;

@FunctionalInterface
public interface Filter {

    boolean test(Student student);
}