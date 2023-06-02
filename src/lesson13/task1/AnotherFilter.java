package lesson13.task1;

public class AnotherFilter implements Filter {
    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Gender.FEMALE) && student.getAverageRate() > 4;
    }
}
