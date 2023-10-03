package Lesson7;

import java.util.Scanner;

// Условия задач https://programmersforum.ru/showthread.php?t=68723
public class Main {
    public static void main(String[] args) {
       /* //1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.
        for(int i=10;i<=20;i++){
            System.out.print(i*i + " ");
        }

        */
        //2. Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.
        // значение n вводится с клавиатуры.
        /*int sum =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + 1;
        }
        System.out.println("Cумма чисел " + sum);*/
        //7. Ввести с клавиатуры 10 пар чисел.
        // сравнить числа в каждой паре и напечатать большие из них.
        /*Scanner in = new Scanner(System.in);
        for (int i = 1; i<=10; i++) {
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            if (num1>num2) {
                System.out.println("Большее число: " + num1);
            }
            else if (num2>num1){
                System.out.println("Большее число: " + num2);
            }
            else System.out.println("Числа равны");
        }*/
        //8. Даны натуральные числа от 20 до 50.Напечатать те из них,
        // которые делятся на 3, но не делятся на 5.
        /*Scanner in = new Scanner(System.in);
        for (int i = 20; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }*/
        //9. даны натуральные числа от 35 до 87. Найти и напечатать те из них,
        // которые при делении на 7 дают остаток 1, 2 или 5.
        /*for (int i = 35; i <= 87; i++) {
            if (i % 7 == 1 || i % 7 == 2||i % 7 == 5)
                System.out.println(i);
        }*/
        //16. В бригаде, работающей на уборке сена, имеется N сенокосилок.Первая сенокосилка
        // работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
        // Сколько часов проработала вся бригада?
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во косилок ");
        int n = in.nextInt();
        System.out.print("Введите кол-во часов, которое работала 1-я косилка ");
        int m = in.nextInt();
        int sum = 0;
        int workTimeInMin = m*60;
        for(int i=1; i <= n; i++){
            sum += workTimeInMin;
            workTimeInMin += 10;
        }
        System.out.println("Время работы бригады " + sum / 60 + " часов и " +
                sum %  60 + " минут");*/

        //17. В ЭВМ вводятся по очереди данные о росте N учащихся класса.
        // Определить средний рост учащихся класса.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учащихся ");
        int n = in.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++) {
            System.out.print("Введите рост учащихся ");
            int rost= in.nextInt();
            sum += rost;
        }
        System.out.println((double) sum/n);*/
        //18. Задано натуральное число N. Найти количество натуральных чисел,
        // не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число N=");
        int n = in.nextInt();
        int kol = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 2 && i % 3 != 0 && i % 5 != 0) {
                kol = kol + 1;
                System.out.println("Число " + i);
            }
        }
        System.out.println("Количество чисел = " + kol);
        */
        //19. Два двузначных числа, записанных одно за другим , образуют четырёхзначное
        //число, которое делится на их произведение. Найти эти числа.

        /*for (int x = 10; x <= 99; x++) {
            for (int y = 10; y <= 99; y++) {
                int num = 100 * x + y;
                if (num % (x * y) == 0)
                    System.out.println(num);
            }
        }
        */
        //21. Дано натуральное n. вычислить 1/(2^2) + 1/(4^2)+ 1/(6^2) ...
        // + 1/(n^2)
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        for(long i = 2; i <= n; i += 2){
            sum += 1.0/(i*i);
        }
        System.out.println(sum);*/
        //28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
        // через сколько лет его долг превысит s тысяч рублей, если за это время
        // он не будет отдавать долг.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите начальную сумму ссуды ");
        int nach_summa = in.nextInt();
        int proc = 20;
        System.out.print("Введите сумму гарантии ");
        int s = in.nextInt();
        double dolg = nach_summa;
        int k = 0;
        while(dolg <= s){
            dolg = dolg * (1 + proc/100.0);
            k++;
        }
        System.out.println("Через " + k + " лет");*/
        // Начальная дистанция 1 км. Каждую неделю дистанция растет на 10%.
        // Через сколько недель дистанция превысит 10 км.
        /*double dist = 1.0;
        int k = 0;
        while(dist < 10.0001 ){
            dist *= 1.1;
            System.out.println(dist);
            k++;
        }
        System.out.println(k);*/
        //30. С помощью оператора while напишите программу определения суммы всех
        // нечетных чисел в диапазоне от 1 до 99 включительно.
        /*int sum = 0;
        int i = 1;
        while(i <= 99){
            sum += i;
            i += 2;
        }
        System.out.println(sum);*/

    }
}
