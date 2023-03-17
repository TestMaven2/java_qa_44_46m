package lesson3;

public enum Day {

    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String value;

    Day(String value) {
        this.value = value;
//        System.out.println("Отработал конструктор с параметром " + value);
    }

    Day() {
//        System.out.println("Отработал пустой конструктор Day");
    }

    public String getValue() {
        return value;
    }
}
