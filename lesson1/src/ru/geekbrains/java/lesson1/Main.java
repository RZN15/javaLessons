package ru.geekbrains.java.lesson1;

public class Main {
    //2 - Создать переменные всех пройденных типов данных и инициализировать их значения
    byte b = 122;
    short sh = 31567;
    static int i = 2147483645;
    long l = 300000L;
    private static float fl = 13.13f;
    double db = -133.13;
    char r = '\u2232';
    boolean bool = r <= 'r';
    //1 - Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
        System.out.println("3 - " + calc(fl, fl, fl,fl));
        System.out.println("4 - " + task10and20(i, -2147483633));
        System.out.println("5 - ");
        isPositiveOrNegative(i);
        System.out.println("6 - " + isNegative(i));
        System.out.println("7 - ");
        greetings("Lisa");
        System.out.println("8 - ");
        task8(2020);
    }

    //3 - Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    private static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4 - Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean task10and20(int x1, int x2) {
        int s = x1 + x2;
        return s >= 10 && s <= 20;
    }

    //5 - Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int x) {
        if( x >= 0 ) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    //6 - Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
    public static boolean isNegative(int x) {
        if( x < 0 ) {
            return true;
        }
        return false;
    }

    //7 - Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }


    //8 - *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void task8(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("високосный");
            }
        }
    }
}
