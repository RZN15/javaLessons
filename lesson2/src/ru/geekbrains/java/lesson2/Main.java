package ru.geekbrains.java.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int[] ww = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        invertArray(arr);
        fillArray();
        changeArray(w);
        fillDiagonal();
        maxAndMin(ww);
        int[] arr1 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr2 = {1, 1, 1, 2, 1};
        int[] arr3 = {0, 0, 0, 0, 0};
        int[] arr4 = {5, 1, 1, 0, 0};
        System.out.println("");
        System.out.println("6)");
        int[][] arrAll = {arr1, arr2, arr3, arr4};
        for (int i = 0; i < arrAll.length; i++) {
            System.out.println(" " + Arrays.toString(arrAll[i]) + " ");
            checkBalance(arrAll[i]);
        };
        cyclicShift(2, arr4);
    }

    // 1
    public static void invertArray(int[] arr) {
        System.out.print("1)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }
    }

    // 2
   public static void fillArray() {
       System.out.println("");
       System.out.print("2)");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }

    // 3
    public static void changeArray(int[] w) {
        System.out.println("");
        System.out.print("3)");
        for (int i = 0; i < w.length; i++) {
            w[i] = w[i] < 6 ? w[i] * 2 : w[i];
            System.out.print(w[i] + " ");
        }
    }

    // 4
    public static void fillDiagonal() {
        System.out.println("");
        System.out.println("4)");
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (i == j  || (i == arr.length - (j + 1))) ? 1 : arr[i][j];
                System.out.print(arr[i][j] + " ");
            };
            System.out.println("");
        }
    }

    // 5
    public static void maxAndMin(int[] arr) {
        System.out.println("");
        System.out.println("5)");
        System.out.println("arr = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("arrAfterSort = " + Arrays.toString(arr));
        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.println("max = " + max + ", min = " + min);
    }

    // 6 checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1])
    public static void checkBalance(int[] arr) {
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            int sumE = Arrays.stream(arr, i , arr.length ).sum();
            int sumB = Arrays.stream(arr, 0, i).sum();
            if ( sumE == sumB ) {
                bool = true;
                break;
            }
        };
        System.out.println(bool);
    }

    // 7
   public  static void cyclicShift(int n, int[] arr) {
       System.out.println("7)");
       System.out.println(Arrays.toString(arr));
       rotate(n, arr);
       System.out.println(Arrays.toString(arr));
    }

   public  static void reverse(int start, int end, int[] arr) {
        for (int i = start; i <= (start + end) / 2; i++) {
            swap(i, start + end - i, arr);
        }
    }

   public  static void swap(int first, int second, int[] arr) {
            int temp = arr[second];
            arr[second] = arr[first];
            arr[first] = temp;
    }

   public static void rotate(int n, int[] arr) {
            reverse(0, n, arr);
            reverse(n + 1, arr.length-1, arr);
            reverse(0, arr.length-1, arr);
    }
}

