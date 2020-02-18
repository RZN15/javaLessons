package ru.geekbrains.java.lesson4;

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
                if (map[i][j] == HUMAN_DOT && i ==1 &&  j == 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] checkDiagPosHum1() {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == HUMAN_DOT && i == j) {
                    count ++;
                } else if (i == j) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }
                }
            }
        }

        return countArr;
    }

    public static int[] checkDiagPosHum2() {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == HUMAN_DOT && i == 2 - j) {
                    count ++;
                } else if (i == 2 - j) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }
                }
            }
        }

        return countArr;
    }

    public static int[] printDiagPosComp1(int counterHuman) {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY && i == j) {
                    count ++;
                } else if (i == j) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }
                }
            }
        }

        return countArr;
    }

    public static int[] printDiagPosComp2(int counterHuman) {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY && i == 2 - j) {
                    count ++;
                } else if (i == 2 - j) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }
                }
            }
        }

        return countArr;
    }



    public static int[] checkLinePosHum1() {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == HUMAN_DOT && i == 0) {
                    count ++;
                } else if (i == 0) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == HUMAN_DOT && i == 1) {
                    count ++;
                } else if (i == 1) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == HUMAN_DOT && i == 2) {
                    count ++;
                } else if (i == 2) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
            }
        }

        return countArr;
    }

    public static int[] checkColumnPosHum1() {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == HUMAN_DOT && j == 0) {
                    count ++;
                } else if (j == 0) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == HUMAN_DOT && j == 1) {
                    count ++;
                } else if (j == 1) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == HUMAN_DOT && j == 2) {
                    count ++;
                } else if (j == 2) {
                    if (count == 2) {
                        countArr = new int[]{i, j};
                    }

                }
            }
        }

        return countArr;
    }

    public static int[] printLinePosComp( int counterHuman) {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY && i == 0) {
                    count ++;
                } else if (i == 0) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == EMPTY && i == 1) {
                    count ++;
                } else if (i == 1) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == EMPTY && i == 2) {
                    count ++;
                } else if (i == 2) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
            }
        }

        return countArr;
    }

    public static int[] printColumnPosComp(int counterHuman) {
        int count = 1;
        int[] countArr = new int[0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY && j == 0) {
                    count ++;
                } else if (j == 0) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == EMPTY && j == 1) {
                    count ++;
                } else if (j == 1) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
                if (map[i][j] == EMPTY && j == 2) {
                    count ++;
                } else if (j == 2) {
                    if (count == counterHuman) {
                        countArr = new int[]{i, j};
                    }

                }
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
                    }
                    if (checkMiddlePosHum() && counterHuman == 1) {
                        x = 0;
                        y = 0;
                        way = 2;
                    }
                    if (checkMiddlePosHum() && checkDiagPosHum1().length > 0 && counterHuman == 2) {
                        x = checkDiagPosHum1()[0];
                        y = checkDiagPosHum1()[1];
                    }

                    if (checkMiddlePosHum() && checkDiagPosHum2().length > 0 && counterHuman == 2) {
                        x = checkDiagPosHum2()[0];
                        y = checkDiagPosHum2()[1];
                    }


                    if (checkLinePosHum1().length > 0  && counterHuman == 2) {
                        x = checkLinePosHum1()[0];
                        y = checkLinePosHum1()[1];
                    }

                    if (checkColumnPosHum1().length > 0  && counterHuman == 2) {
                        x = checkColumnPosHum1()[0];
                        y = checkColumnPosHum1()[1];
                    }
                    if (way == 2 && counterHuman == 2 && printDiagPosComp1(counterHuman).length > 0) {
                        x = printDiagPosComp1(counterHuman)[0];
                        y = printDiagPosComp1(counterHuman)[1];
                        way = 3;
                    }
                    if (way == 2 && counterHuman == 2 && printDiagPosComp2(counterHuman).length > 0) {
                        x = printDiagPosComp2(counterHuman)[0];
                        y = printDiagPosComp2(counterHuman)[1];
                        way = 4;
                    }
                    if (way == 3 && counterHuman == 3 && printDiagPosComp1(counterHuman).length > 0) {
                        x = printDiagPosComp1(counterHuman)[0];
                        y = printDiagPosComp1(counterHuman)[1];
                       // way = 5;
                    }
                    if (way == 4 && counterHuman == 3 && printDiagPosComp2(counterHuman).length > 0) {
                        x = printDiagPosComp2(counterHuman)[0];
                        y = printDiagPosComp2(counterHuman)[1];
                        //way = 6;
                    }
                    if (way == 1 && counterHuman == 2 && printLinePosComp(counterHuman).length > 0) {
                        x = printLinePosComp(counterHuman)[0];
                        y = printLinePosComp(counterHuman)[1];
                        way = 7;
                    }
                    if (way == 1 && counterHuman == 2 && printColumnPosComp(counterHuman).length > 0) {
                        x = printColumnPosComp(counterHuman)[0];
                        y = printColumnPosComp(counterHuman)[1];
                        way = 8;
                    }
                    if (way == 7 && counterHuman == 3 && printLinePosComp(counterHuman).length > 0) {
                        x = printLinePosComp(counterHuman)[0];
                        y = printLinePosComp(counterHuman)[1];
                        //way = 5;
                    }
                    if (way == 8 && counterHuman == 3 && printColumnPosComp(counterHuman).length > 0) {
                        x = printColumnPosComp(counterHuman)[0];
                        y = printColumnPosComp(counterHuman)[1];
                        //way = 6;
                    } else {
                        x = ;
                        y = 1;
                    }

                } while (!isCellValid(x, y));
                map[y][x] = AI_DOT;
            }

            public static boolean isCellValid(int x, int y) {
                if (x < 0 || y < 0 || x > 2 || y > 2) {
                    return false;
                }
                if (map[y][x] == EMPTY) {
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
                map[y][x] = HUMAN_DOT;
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

