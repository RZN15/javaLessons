package ru.geekbrains.java.lesson5;

public class Main {


    public static void main(String[] args) {
        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Ivanov", " Ivan", "Ivanovichivivan", "director","vvv@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Ivanov1", " Ivan1", "Ivanovichivivan1", "director","vvv1@mailbox.com", "892312312", 30000, 44);
        persArray[2] = new Employee("Ivanov2", " Ivan2", "Ivanovichivivan2", "director","vvv2@mailbox.com", "892312312", 30000, 37);
        persArray[3] = new Employee("Ivanov3", " Ivan3", "Ivanovichivivan3", "director","vvv3@mailbox.com", "892312312", 30000, 60);
        persArray[4] = new Employee("Ivanov4", " Ivan4", "Ivanovichivivan4", "director","vvv4@mailbox.com", "892312312", 30000, 50);
       for (Employee em : persArray) {
         if (em.getAge() > 40) {
             em.info();
         }
       }
    }
}
