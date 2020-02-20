package ru.geekbrains.java.lesson5;

public class Employee {
    private String surName;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee(String surName, String name, String patronymic, String position, String email, String tel, int salary, int age) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void info() {
        System.out.println("Фамилия: " + surName + "; Имя : " + name + "; Отчество: " + patronymic + "; Должность: " + position + "; email: " + email + "; Телефон: " + tel + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}