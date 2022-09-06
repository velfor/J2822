package Lesson11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //заполнение случайными числами
    static void fillRandom(int[] mas, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = gen.nextInt(right - left + 1) + left;
        }
    }

    static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    static int proizv(int[] mas) {
        int pr = 1;
        for (int i = 0; i < mas.length; i++) {
            pr = pr * mas[i];
        }
        return pr;
    }

    static int sumOfArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }

    static double arifmAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    static int countLessK(int[] mas, int k) {
        int qty = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < k) qty++;
        }
        return qty;
    }

    static int numElem(int[] mas, int k) {
        int res = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > k) {
                res = i;
                break;
            }
        }
        return res;
    }

    static void printLessRight(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                System.out.print(mas[i] + " ");
            }
        }
        System.out.println();
    }
    static int countLessRight(int[] mas) {
        int qty = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                qty++;
            }
        }
        return qty;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillRandom(arr, -10, 10);
        print(arr);
        Scanner in = new Scanner(System.in);
        //Дан массив из десяти целых чисел. Найти их сумму
        //System.out.println("Сумма элементов массива "+sumOfArray(arr));
        //Дан массив из десяти целых чисел. Найти их произведение
        //System.out.println("Произведение массива: " + proizv(arr));
        //Дан массив из десяти целых чисел. Найти их среднее арифметическое.
        //System.out.println(arifmAvg(arr));
        // Дано целое число K и массив из десяти целых чисел.
        // Вывести количество чисел в массиве, меньших K.
        /*System.out.print("Введите к ");
        int k = in.nextInt();
        System.out.println("Кол-во элементов <k " + countLessK(arr, k));*/
        //Дано целое число K и  массив из десяти целых чисел.
        // Вывести номер первого элемента, большего K.
        // Если таких чисел нет, то вывести -1.
        /*System.out.print("Введите к ");
        int k = in.nextInt();
        System.out.println("Номер первого элемента >k " + numElem(arr, k));*/
        //Дано целое число N (> 1) и массив из N целых чисел. Вывести те
        //элементы массива, которые меньше своего правого соседа,
        // и количество K таких элементов.

    }
}
