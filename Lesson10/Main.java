package Lesson10;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
//    Proc1. Описать функцию PowerA3(A), вычисляющую третью степень числа A и возвращающую
//    ее. С помощью этой функции найти третьи степени пяти разных чисел.

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        for(int i=0; i <5; i++){
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            System.out.println(x + "^3 = " + powerA3(x));
        }*/
//        Proc3. Описать 2 функции aMean(X, Y), вычисляющую
//        среднее арифметическое AMean = (X+Y)/2 и gMean(X, Y) среднее геометрическое
//                GMean =√X·Y двух положительных чисел X и Y. С помощью
//        этих функций найти среднее арифметическое и среднее геометрическое
//        для пар (A, B), (A, C), (A, D), если даны A, B, C, D.
        /*int a = 5;
        for(int i =0; i < 3; i++){
            int z = (int)(Math.random()*10);
            System.out.println(a + " " + z + " amean = " + aMean(a,z));
            System.out.println(a + " " + z + " gmean = " + gMean(a,z));
        }*/
        //Proc4. Описать 2 функции triangleP(a), вычисляющую по стороне a
        //равностороннего треугольника его периметр P = 3·a и triangleS(a) площадь
        // S = (a^2*√3)/4
        //(параметры являются вещественными). С помощью этих функций найти периметры и площади
        //трех равносторонних треугольников с данными сторонами.

        /*Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите сторону равностороннего треугольника ");
            double a = in.nextDouble();
            System.out.println("\n Периметр треугольника со стороной " + a + " = " + perimetr(a));
            System.out.println("Площадь треугольника со стороной " + a + " = " + ploschad(a));
        }*/
        //Proc5. Описать функцию RectP(x1, y1, x2, y2), вычисляющую периметр P
        //прямоугольника со сторонами, параллельными осям координат, по координатам (x1, y1),
        // (x2, y2) его противоположных вершин
        //С помощью этой функции найти периметры трех прямоугольников с данными противоположными
        // вершинами.
        /*Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            System.out.println("Введите вершину x1: ");
            int x1 = in.nextInt();
            System.out.println("Введите вершину x2: ");
            int x2 = in.nextInt();
            System.out.println("Введите вершину y1: ");
            int y1 = in.nextInt();
            System.out.println("Введите вершину y2: ");
            int y2 = in.nextInt();
            System.out.println("\n Периметр прямоугольника равен: " + rectP(x1, y1, x2, y2));*/
        //Вычислить площадь треугольника по формуле Герона
        // S = √p*(p-a)*(p-b)*(p-c)
        // р - полупериметр, a, b, c - стороны
        //Проверить с помощью функции, что по сторонам a, b, c можно построить треугольник
        //Вычислить площадь 3-х треугольников
        /*Scanner in = new Scanner(System.in);
        for(int i= 0; i < 3; i++){
            System.out.println("Введите стороны треугольника");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(isTriangle(a,b,c)){
                System.out.println("Площадь треугольника " + s(a,b,c));
            }
            else{
                System.out.println("Треугольник с такими сторонами не существует");
            }
//        }*/
//        Proc6. Описать функцию DigitCount(K), находящую количество
//        цифр целого положительного числа K. С помощью этой функции
//        найти количество цифр для каждого из пяти целых чисел.
        /*Random gen = new Random();
        for(int i = 0; i <5; i++){
            int x = gen.nextInt(1_000);
            System.out.println("В числе " + x + " " + digitCount(x)+ " цифр");
            System.out.println("В числе " + x + " " + summ(x)+ " сумма цифр");

        }*/
        //Proc8. Описать функцию AddRightDigit(D, K), добавляющую к целому положительному числу
        // K справа цифру D. С помощью этой функции последовательно добавить к данному числу K
        // справа 5 раз по одной цифре,
        //выводя результат каждого добавления.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int k = in.nextInt();
        for(int i = 0; i <5; i++){
            System.out.print("Введите цифру ");
            int d = in.nextInt();
            System.out.println(addRightDigit(d,k));
        }*/
//        Proc16. Описать функцию Sign(X) целого типа, возвращающую для целого
//        числа X
//        следующие значения:
//        −1, если X < 0; 0, если X = 0; 1, если X > 0.
//        С помощью этой функции найти значение выражения Sign(A) + Sign(B)
//        для данных вещественных чисел A и B.

    }//END MAIN


    static int rectP(int x1, int y1, int x2, int y2) {
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        return 2 * (a + b);
    }

    static double aMean(int x, int y) {
        return (x + y) / 2.0;
    }

    static double gMean(int x, int y) {
        return Math.sqrt(x * y);
    }

    static double perimetr(double a) {
        return 3 * a;
    }

    static double ploschad(double a) {
        return (a * a * Math.sqrt(3) / 4);
    }

    static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    static double p(int a, int b, int c) {
        return (a + b + c) / 2.0;
    }

    static double s(int a, int b, int c) {
        double p = p(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //ф-ция подсчитывает кол-во цифр в числе
    static int digitCount(int a) {
        int k = 0;
        while (a != 0) {
            a /= 10;
            k++;
        }
        return k;
    }

    //ф-ция подсчитывает сумму цифр в числе
    static int summ(int a) {
        int summ = 0;
        while (a != 0) {
            int c = a % 10;
            a /= 10;
            summ += c;
        }
        return summ;
    }

    static int addRightDigit(int d, int k) {
        return k * 10 + d;
    }
    static int sign(int k){
        int sign = 0;
        if(k < 0) sign = -1;
        else if(k==0) sign = 0;
        else if(k > 0) sign = 1;
        return sign;
    }
}

//Random gen = new Random();
//int k = gen.nextInt(21) - 10 // от -10 до 10
//в скобках количество чисел
// после скобок прибавляем левую границу диапазона
