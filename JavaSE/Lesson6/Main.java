package Lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
//                1.4, . . . , 2 кг конфет.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену как вещественное число ");
        double price = in.nextDouble();
        for(double weight = 1.2; weight < 2.001; weight += 0.2){
            System.out.println(Math.round(weight*10)/10.0 + " кг стоят " +
                    Math.round(weight*price*100)/100.0);
        }*/
//        For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
//        от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");

        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма = " + sum);*/
//        For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
//        чисел от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");

        int a = in.nextInt();
        int b = in.nextInt();
        int pr = 1;
        for (int i = a; i <= b; i++) {
            pr = pr * i;

        }
        System.out.println("Произведение =" + pr);*/
//        For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
//        чисел от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа, первое меньше второго ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i*i;
        }
        System.out.println("Сумма квадратов " + sum);*/
//        For10. Дано целое число N (> 0). Найти сумму
//        1/1 + 1/2 + 1/3 + . . . + 1/N  (вещественное число).
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + 1.0/i;
        }
        System.out.println(sum);*/
//        For11. Дано целое число N (> 0). Найти сумму
//        (N+0)^2 + (N + 1)^2 + (N + 2)^2 + . . . + (N+N)^2
//        (целое число).
//        Math.pow(N+i,2) - > double
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + (n+i)*(n+i);
        }*/
        //Series1. Даны десять вещественных чисел. Найти их сумму.
        /*double sum = 0.0;
        Scanner in = new Scanner(System.in);
        for(int i= 1; i <= 10; i++){
            double x = in.nextDouble();
            sum = sum + x;
        }
        System.out.println("Сумма = " + sum);*/

    }
}
