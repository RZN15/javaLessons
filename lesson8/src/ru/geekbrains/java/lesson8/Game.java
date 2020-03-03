package ru.geekbrains.java.lesson8;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game extends JFrame {

    private final static Random rnd = new Random();
    private static int stepCounter = 0;


    public static boolean checkWin(char dot, JButton [][] map) {
        if (map[0][0].getText().charAt(0) == dot &&
                map[0][1].getText().charAt(0) == dot &&
                map[0][2].getText().charAt(0) == dot) {
            return true;
        }
        if (map[1][0].getText().charAt(0) == dot &&
                map[1][1].getText().charAt(0) == dot &&
                map[1][2].getText().charAt(0) == dot) {
            return true;
        }
        if (map[2][0].getText().charAt(0) == dot &&
                map[2][1].getText().charAt(0) == dot &&
                map[2][2].getText().charAt(0) == dot) {
            return true;
        }
        if (map[0][0].getText().charAt(0) == dot &&
                map[1][0].getText().charAt(0) == dot &&
                map[2][0].getText().charAt(0) == dot) {
            return true;
        }
        if (map[0][1].getText().charAt(0) == dot &&
                map[1][1].getText().charAt(0) == dot &&
                map[2][1].getText().charAt(0) == dot) {
            return true;
        }
        if (map[0][2].getText().charAt(0) == dot &&
                map[1][2].getText().charAt(0) == dot &&
                map[2][2].getText().charAt(0) == dot) {
            return true;
        }
        if (map[0][0].getText().charAt(0) == dot &&
                map[1][1].getText().charAt(0) == dot &&
                map[2][2].getText().charAt(0) == dot) {
            return true;
        }
        if (map[2][0].getText().charAt(0) == dot &&
                map[1][1].getText().charAt(0) == dot &&
                map[0][2].getText().charAt(0) == dot) {
            return true;
        }
        return false;
    }

    public Game() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 450);
        setLocation(450, 450);
        JPanel panel = new JPanel(new GridLayout(3,3));
        JButton [][] btns = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btns[i][j] = new JButton();
                final JButton copy = btns[i][j];
                copy.addActionListener(actionEvent -> {
                    stepCounter++;
                    copy.setText("X");
                    copy.setEnabled(false);
                    if (stepCounter != 9) {
                        moveAI(btns);
                    } else {
                        this.dispose();
                        JFrame alert = new JFrame("info");
                        alert.setSize(500,500);
                        alert.setLocation(450, 450);
                        JPanel p = new JPanel(new FlowLayout());
                        JButton winGame = new JButton("default");
                        if (checkWin(new String("X").charAt(0), btns) && checkWin(new String("O").charAt(0), btns)) {
                            winGame = new JButton("Win both");
                        } else if (checkWin(new String("X").charAt(0), btns)) {
                            winGame = new JButton("Win human");
                        } else if (checkWin(new String("O").charAt(0), btns)) {
                            winGame = new JButton("Win ai");
                        } else {
                            winGame = new JButton("not win");
                        }
                        JButton newGame = new JButton("NEW GAME");
                        JButton close = new JButton("CLOSE");
                        newGame.addActionListener(actionEvent1 -> {
                            alert.dispose();
                            stepCounter = 0;
                            new Game();
                        });
                        close.addActionListener(actionEvent1 -> {
                            alert.dispose();
                        });
                        p.add(newGame);
                        p.add(close);
                        p.add(winGame);
                        alert.add(p);
                        alert.setVisible(true);
                        alert.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    }
                });

                panel.add(copy);
            }
        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }

    private void moveAI(JButton[][] btns) {
        while (true) {
            int x = rnd.nextInt(3), y = rnd.nextInt(3);
            if (btns[x][y].isEnabled()) {
                btns[x][y].setText("O");
                btns[x][y].setEnabled(false);
                stepCounter++;
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Game();
    }
}


