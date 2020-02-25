package ru.geekbrains.java.lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void decreaseFood(int n) {
        food -= n;
        if(food < 0) throw new IllegalArgumentException("Кот не может съесть больше чем в тарелке");
    }
    public int getFood() {
        return this.food;
    }
    public void setFood(int food) {
        this.food = food;
    }

}
