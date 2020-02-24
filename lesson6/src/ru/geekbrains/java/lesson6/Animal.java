package ru.geekbrains.java.lesson6;

interface Swimmable {
    public void swim(int distanceSwim);
}

interface Runnable {
    public void run(int distanceRun);
}

interface Jumpable {
    public void jump(float heightJump);
}

public class Animal implements Swimmable, Runnable, Jumpable {
    protected int distanceRun;
    protected int distanceSwim = 0;
    protected float heightJump;
    protected String name;

    public Animal(int distanceRun, int distanceSwim, float heightJump, String name) {
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
        this.distanceSwim = distanceSwim;
        this.name = name;
    }

    public Animal (int distanceRun, int heightJump, String name) {
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
        this.name = name;
    }

    @Override
    public void swim(int distanceSwim) {
        this.infoClass();
        System.out.println(name + " " + (distanceSwim <= this.distanceSwim ? "умеет плавать " + true : "не умеет плавать " + false));
    }

    @Override
    public void run(int distanceRun) {
        this.infoClass();
        System.out.println(name + " " + (distanceRun <= this.distanceRun ? "умеет бегать " + true : "не умеет бегать " + false));
    }

    @Override
    public void jump(float heightJump) {
        this.infoClass();
        System.out.println(name + " " + (heightJump <= this.heightJump ? "умеет прыгать " + true : "не умеет прыгать " + false));
    }

    public void infoClass() {
        System.out.print(this.getClass().getSimpleName() + " ");
    }
}
