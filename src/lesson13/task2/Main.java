package lesson13.task2;

public class Main {

    public static void main(String[] args) {

        Utils.print("Hello", 4, new StringOperation());

        Utils.print("Hello", 4, new Operation() {
            @Override
            public String operation(String word, int count) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    builder.append(word).append(" ");
                }
                return builder.toString();
            }
        });

        Utils.print("Hello", 4, (x, y) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < y; i++) {
                builder.append(x).append(" ");
            }
            return builder.toString();
        });

        Operation operation = (x, y) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < y; i++) {
                builder.append(x.toUpperCase()).append(" ");
            }
            return builder.reverse().toString();
        };

        System.out.println("Передаём один метод внутрь другого метода.");
        Utils.callMethod("Hello", 4, operation);
    }
}
