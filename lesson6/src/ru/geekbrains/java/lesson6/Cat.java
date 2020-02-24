package ru.geekbrains.java.lesson6;

public class Cat extends Animal {

    public Cat (int distanceRun, int heightJump, String name) {
        super(distanceRun, heightJump, name);
    }

    public void swim() {
        this.infoClass();
        System.out.println(name + " " + "не умеет плавать" );
    }
}
