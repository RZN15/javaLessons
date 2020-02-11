package ru.geekbrains.java.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //1
        task1(0, 9);
        //2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        task2(words);
    }

    public static int randNum(int min, int max) {
        Random rnd = new Random(System.currentTimeMillis());
        return min + rnd.nextInt(max - min + 1);
    }

    public static void task1Helper(int min, int max, Scanner sc ) {
        int number = randNum(min, max);
        System.out.println("number = " + number);
        int x;
        int count = 0;
        do {
            System.out.println("Угадайте число от  " + min + " до " + max);
            x = sc.nextInt();
            if ( x > number)  System.out.println("Слишком большое, загадайте меньше");
            if ( x < number)  System.out.println("Слишком маленькое, загадайте больше");
            count ++;
        } while ( x != number && count <= 3 );

        if (count <= 3 &&  x == number) {
            System.out.println("Угадали, " + x );
        } else  {
            System.out.println("Не угадали");
        }
    }

    public static void task1(int min, int max) {
        Scanner sc = new Scanner(System.in);
        task1Helper(min, max, sc);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int y = sc.nextInt();
        if ( y == 1 ) task1(min, max);
        if ( y == 0 ) return;
    }

    public static void task2(String[] args) {
        int randIdx = randNum(0, args.length - 1);
        String word = args[randIdx];
        System.out.println("word = " +  word);
        String strStr = "" + word.charAt(0) + word.charAt(1) + "#############";
        Scanner sc = new Scanner(System.in);
        String userWord = "";
        List<String> strList = Arrays.asList(args);
        String joinedString = String.join(", ", strList);
        while ( !userWord.equals(word) ) {
            System.out.println("Угадайте слово из списка " + joinedString);
            userWord = sc.nextLine().trim().toLowerCase();
            if (!userWord.equals(word)) System.out.println("подсказка! Начинается на " + strStr);
         }
        System.out.println("Угадали, " + userWord + " = " +  word);
    }
}
