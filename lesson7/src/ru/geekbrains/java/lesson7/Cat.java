package ru.geekbrains.java.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        try{
            if (p.getFood()/2 < appetite) return;
            p.decreaseFood(appetite);
        }catch(IllegalArgumentException e){
            throw e;
        }
        this.satiety = true;
    }
    public void info() {
        System.out.println("CatName: " + this.name + " satiety : " + satiety);
    }

}
