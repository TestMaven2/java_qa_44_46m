package lesson3;

public class Main {

    public static void main(String[] args) {

        Day day = Day.WEDNESDAY;

        System.out.println(day);

//        if (day.equals(Day.MONDAY)) {
//            System.out.println("Это понедельник");
//        } else {
//            System.out.println("Это не понедельник, это какой-то другой день.");
//        }

        switch (day) {
            case MONDAY:
                System.out.println("Это понедельник");
                break;
            case TUESDAY:
                System.out.println("Это вторник");
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Это среда или четверг");
                for (int i = 0; i < 10; i++) {
                    if (4 < 5) {
                        switch (day) {

                        }
                    }
                }
                break;
            case FRIDAY:
                System.out.println("Это пятница");
                break;
            case SATURDAY:
                System.out.println("Это суббота");
                break;
            case SUNDAY:
                System.out.println("Это воскресенье");
                break;
        }
    }
}
