package ru.geekbrains.java.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static char[][] map;
    static Scanner sc = new Scanner(System.in);
    static char HUMAN_DOT = 'x';
    static char AI_DOT = '0';
    static char EMPTY = '_';
    static int counterHuman = 0;
    static Random rnd = new Random();
    static int way = 0;

    public static boolean checkMiddlePosHum() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == HUMAN_DOT && i == 1 && j == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] checkDiagPosHum1() {
        int[] countArr = new int[0];
        if ((map[0][0] == HUMAN_DOT && map[1][1] == HUMAN_DOT && map[2][2] == EMPTY) ||
                map[0][0] == AI_DOT && map[1][1] == AI_DOT && map[2][2] == EMPTY) {
            countArr = new int[]{2, 2};
        } else if ((map[0][0] == HUMAN_DOT && map[1][1] == EMPTY && map[2][2] == HUMAN_DOT) ||
                (map[0][0] == AI_DOT && map[1][1] == EMPTY && map[2][2] == AI_DOT)) {
            countArr = new int[]{1, 1};
        } else if ((map[0][0] == EMPTY && map[1][1] == HUMAN_DOT && map[2][2] == HUMAN_DOT) ||
                (map[0][0] == EMPTY && map[1][1] == AI_DOT && map[2][2] == AI_DOT)) {
            countArr = new int[]{0, 0};
        }
        return countArr;
    }

    public static int[] checkDiagPosHum2() {
        int[] countArr = new int[0];
        if ((map[0][2] == HUMAN_DOT && map[1][1] == HUMAN_DOT && map[2][0] == EMPTY) ||
                (map[0][2] == AI_DOT && map[1][1] == AI_DOT && map[2][0] == EMPTY)) {
            countArr = new int[]{2, 0};
        } else if ((map[0][2] == HUMAN_DOT && map[1][1] == EMPTY && map[2][0] == HUMAN_DOT) ||
                (map[0][2] == AI_DOT && map[1][1] == EMPTY && map[2][0] == AI_DOT)) {
            countArr = new int[]{1, 1};
        } else if ((map[0][2] == EMPTY && map[1][1] == HUMAN_DOT && map[2][0] == HUMAN_DOT) ||
                (map[0][2] == EMPTY && map[1][1] == AI_DOT && map[2][0] == AI_DOT)) {
            countArr = new int[]{0, 2};
        }
        return countArr;
    }


    public static int[] checkLinePosHum1() {
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            if ((map[i][0] == HUMAN_DOT && map[i][1] == HUMAN_DOT && map[i][2] == EMPTY) ||
                    (map[i][0] == AI_DOT && map[i][1] == AI_DOT && map[i][2] == EMPTY)) {
                countArr = new int[]{i, 2};
            } else if ((map[i][0] == HUMAN_DOT && map[i][1] == EMPTY && map[i][2] == HUMAN_DOT) ||
                    (map[i][0] == AI_DOT && map[i][1] == EMPTY && map[i][2] == AI_DOT)) {
                countArr = new int[]{i, 1};
            } else if ((map[i][0] == EMPTY && map[i][1] == HUMAN_DOT && map[i][2] == HUMAN_DOT) ||
                    (map[i][0] == EMPTY && map[i][1] == AI_DOT && map[i][2] == AI_DOT)) {
                countArr = new int[]{i, 0};
            }
        }
        return countArr;
    }

    public static int[] checkColumnPosHum1() {
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            if ((map[0][i] == HUMAN_DOT && map[1][i] == HUMAN_DOT && map[2][i] == EMPTY) ||
                    (map[0][i] == AI_DOT && map[1][i] == AI_DOT && map[2][i] == EMPTY)) {
                countArr = new int[]{2, i};
            } else if ((map[0][i] == HUMAN_DOT && map[1][i] == EMPTY && map[2][i] == HUMAN_DOT) ||
                    (map[0][i] == AI_DOT && map[1][i] == EMPTY && map[2][i] == AI_DOT)) {
                countArr = new int[]{1, i};
            } else if ((map[0][i] == EMPTY && map[1][i] == HUMAN_DOT && map[2][i] == HUMAN_DOT) ||
                    (map[0][i] == EMPTY && map[1][i] == AI_DOT && map[2][i] == AI_DOT)) {
                countArr = new int[]{0, i};
            }
        }
        return countArr;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN_DOT)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(AI_DOT)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                break;
            }
        }
        System.out.println("Игра закончена!");
    }

    public static boolean checkWin(char dot) {
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
            return true;
        }
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
            return true;
        }
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            if (!checkMiddlePosHum() && counterHuman == 1) {
                x = 1;
                y = 1;
                way = 1;
                break;
            } else if (checkMiddlePosHum() && counterHuman == 1) {
                x = 0;
                y = 0;
                way = 2;
                break;
            } else if (checkDiagPosHum1().length > 0 && counterHuman > 1 && counterHuman < 5) {
                x = checkDiagPosHum1()[0];
                y = checkDiagPosHum1()[1];
                break;
            } else if (checkDiagPosHum2().length > 0 && counterHuman > 1 && counterHuman < 5) {
                x = checkDiagPosHum2()[0];
                y = checkDiagPosHum2()[1];
                break;
            } else if (checkLinePosHum1().length > 0 && counterHuman > 1 && counterHuman < 5) {
                x = checkLinePosHum1()[0];
                y = checkLinePosHum1()[1];
                break;
            } else if (checkColumnPosHum1().length > 0 && counterHuman > 1 && counterHuman < 5) {
                x = checkColumnPosHum1()[0];
                y = checkColumnPosHum1()[1];
                break;
            } else {
                x = rnd.nextInt(3);
                y = rnd.nextInt(3);
            }

        } while (!isCellValid(x, y));
        map[x][y] = AI_DOT;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        if (map[x][y] == EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите ячейку в формате X Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = HUMAN_DOT;
        counterHuman++;

    }

    public static void initMap() {
        map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.println();
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}

