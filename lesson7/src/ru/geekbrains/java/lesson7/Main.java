package ru.geekbrains.java.lesson7;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1);
        Cat cat2 = new Cat("Barsik2", 2);
        Cat cat3 = new Cat("Barsik3", 3);
        Cat cat4 = new Cat("Barsik4", 4);
        Cat cat5 = new Cat("Barsik5", 5);
        Cat[] catArr = {cat,cat2, cat3,cat4,cat5};
        Plate plate = new Plate(6);
        plate.setFood(17);
        plate.info();
            for (Cat catItem: catArr) {
                catItem.eat(plate);
                catItem.info();
            }
        plate.info();
    }
}
