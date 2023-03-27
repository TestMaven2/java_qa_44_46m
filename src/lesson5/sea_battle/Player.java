package lesson5.sea_battle;

import java.util.Scanner;

public class Player {

    private String name;
    private char[][] field;
    private int fieldSize = 10;
    private int[][] deckShipAmount =
            {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
    private char emptyCell = '.';
    private char valueForShip = 'O';
    private boolean isAlive = true;

    public Player(String name) {
        this.name = name;
        this.field = new char[fieldSize][fieldSize];
        initialFill();
    }

    public String getName() {
        return name;
    }

    public char[][] getField() {
        return field;
    }

    @Override
    public String toString() {
        return name;
    }

    private void initialFill() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = emptyCell;
            }
        }
    }

    public void printField() {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void fillGameField() {
        Scanner scanner = new Scanner(System.in);
        for (int[] row : deckShipAmount) {
            int decks = row[0];
            int ships = row[1];

            for (int i = 0; i < ships; i++) {
                System.out.printf("%s, разместите корабль на %d палубы.\n", name, decks);
                System.out.println("Введите ряд.");
                // Здесь везде должны быть проверки на корректность введённых значений.
                int inputtedRow = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите столбец.");
                int inputtedColumn = Integer.parseInt(scanner.nextLine());
                System.out.println("Выберите расположение: 1 - горизонтальное, 2 - вертикальное.");
                int direction = Integer.parseInt(scanner.nextLine());

                // Проверка корректности введённых координат.
                boolean result = isCoordinatesCorrect(inputtedRow, inputtedColumn, direction, decks);
                // В зависимости от результата либо размещать корабль,
                // либо заставить игрока повторить ввод координат.

                placeShip(inputtedRow, inputtedColumn, direction, decks);
                printField();
            }
        }
    }

    private void placeShip(int x, int y, int direction, int decks) {
        for (int i = 0; i < decks; i++) {
            field[x][y] = valueForShip;
            if (direction == 1) {
                y++;
            } else {
                x++;
            }
        }
    }

    private boolean isCoordinatesCorrect(int x, int y, int direction, int decks) {
        // Вернуть true, если координаты корректны,
        // то есть корабль не соприкасается и не пересекает другие
        // и не выходит за пределы поля.
        // Иначе вернуть false.

        return false;
    }
}