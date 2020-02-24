package ru.geekbrains.java.lesson6;

public class Main {

    public static void main(String[] args) {
	    Cat catAngor = new Cat(200 , 2, "Angor");
        catAngor.run(100);
        catAngor.jump(300);
        catAngor.swim();
        Cat catBlue = new Cat(100 , 5, "Blue");
        catBlue.run(300);
        catBlue.jump(3);

        Dog dog1 = new Dog(500 , 10,0.5f , "dog1");
        dog1.run(100);
        dog1.jump(0.2f);
        dog1.swim(5);
        Dog dog2 = new Dog(400 , 20,0.8f , "dog2");
        dog2.run(600);
        dog2.jump(1);
        dog2.swim(25);
    }
}
