package lesson5.sea_battle;

import java.util.Scanner;

public class SeaBattle {

    private static Player[] players = new Player[2];

    public static void main(String[] args) {

        // Создание игроков
        createPlayers();

        // Заполнение полей игроков
        fillPlayerFields();

        // Старт игры

        // Вывод результата
    }

    private static void createPlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Морской бой.");
        System.out.println("Игрок 1, введите своё имя.");
        String name = scanner.nextLine();
        players[0] = new Player(name);
//        players[0].printField();

        System.out.println("Игрок 2, введите своё имя.");
        name = scanner.nextLine();
        players[1] = new Player(name);
    }

    private static void fillPlayerFields() {
        for (Player player : players) {
            player.fillGameField();
        }
    }
}
