package Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
//        недели, соответствующее данному числу (1 — «понедельник», 2 — «втор-
//        ник» и т. д.).
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное целое число ");
        int day = in.nextInt();
        if(day == 1){
            System.out.println("понедельник");
        }
        else if(day == 2){
            System.out.println("вторник");
        }
        else if(day == 3){
            System.out.println("среда");
        }
        else if(day == 4){
            System.out.println("четверг");
        }
        else if(day == 5){
            System.out.println("пятница");
        }
        else if(day == 6){
            System.out.println("суббота");
        }
        else if(day == 7){
            System.out.println("воскресенье");
        }
        else{
            System.out.println("Нет для с таким номером");
        }*/
       /*switch(day){
           case 1:
               System.out.println("понедельник");
               break;
           case 2:
               System.out.println("вторник");
               break;
           case 3:
               System.out.println("среда");
               break;
           case 4:
               System.out.println("четверг");
               break;
           case 5:
               System.out.println("пятница");
               break;
           case 6:
               System.out.println("суббота");
               break;
           case 7:
               System.out.println("воскресенье");
               break;
           default:
               System.out.println("Нет дня с таким номером");
       }*/
        //Scanner in = new Scanner(System.in);
        //Case2. Дано целое число K.
        //Вывести строку-описание оценки,
        //соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне 1–5,
        //то вывести строку «ошибка».
        /*System.out.print("Введите целое число: ");
        int num = in.nextInt();
        switch (num){
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
        }*/
//        Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и
//        т. д.). Вывести название соответствующего времени года («зима», «весна», «лето»,
//                «осень»).

        /*System.out.print("Введите целое число: ");
        int num = in.nextInt();
        switch (num){
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Ошибка");
        }*/
//        Case4◦ Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
//        февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.

        /*System.out.print("Введите целое число: ");
        int num = in.nextInt();
        switch (num) {
            case 2:
                System.out.println("28");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                     System.out.println("30");
                break;
            default:
                System.out.println("Ошибка");


        }*/
/*        Case15. Мастям игральных карт присвоены порядковые номера: 1 — пики,
                2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки,
                присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны
        два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты
        (1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка
        бубен», «дама червей», «туз треф» и т. п.*/
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите достоинство карты число от 2 до 14 ");
        int rank = in.nextInt();
        System.out.print("Введите номер масти 1 — пики, 2 — трефы, 3 — бубны, 4 — червы ");
        int suit = in.nextInt();
        switch(rank){
            case 2:
                System.out.print("двойка ");
                break;
        }

        switch(suit){
            case 1:
                System.out.println("пик");
                break;
            case 2:
                System.out.println("треф");
                break;
            case 3:
                System.out.println("бубей");
                break;
            case 4:
                System.out.println("червей");
                break;
            default:
                System.out.println("Ошибка в масти");
        }*/
        //ЦИКЛЫ
        /*for(int i = 1; i <= 10; i = i + 1){
            System.out.print(i + " ");
        }*/
        //For1. Даны целые числа K (111) и N (5) (N > 0). Вывести число K(111) N(5) раз
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int k = in.nextInt();
        System.out.print("Введите кол-во повторений ");
        int n = in.nextInt();
        for(int i = 1; i <= n; i = i + 1){
            System.out.print(k + " ");
        }*/
        //For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
        //целые числа, расположенные между A и B (включая сами числа A и B), а
        //также количество N этих чисел.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число A: ");
        int a = in.nextInt();
        System.out.print("Введите целое число В: ");
        int b = in.nextInt();
        int result = 0;
        for (int i = a; i <= b; i = i+1){
            System.out.print(i+" ");
            result = result + 1;
        }
        System.out.println("\n"+result);*/
//        For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
//        целые числа, расположенные между A и B (не включая числа A и B), а
//        также количество N этих чисел.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число A: ");
        int a = in.nextInt();
        System.out.print("Введите целое число В: ");
        int b = in.nextInt();
        int result = 0;
        for(int i=b-1; i > a; i = i - 1){
            System.out.print(i+" ");
            result++;
        }
        System.out.println("Кол-во " + result);*/
        //For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
        //        2, . . . , 10 кг конфет.
        /*Scanner in = new Scanner (System.in);
        System.out.println("Введите цену за 1 кг конфет: ");
        double tsena = in.nextDouble();
        for (int ves = 1; ves <= 10; ves = ves + 1){
            System.out.println(ves + " кг стоит " + tsena*ves);
        }*/
        //For5. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
        //        0.2, . . . , 1 кг конфет.
        Scanner in = new Scanner (System.in);
        System.out.println("Введите цену за 1 кг конфет: ");
        double price = in.nextDouble();
        for(double weight = 0.1; weight < 1.01; weight = weight + 0.1){
            System.out.println(Math.round(weight*10)/10.0 + " кг стоит " +
                    Math.round(price*weight*100)/100.0);
        }
        //for(int i=1; i <= 10; i++){
        //System.out.println((double)i/10 + " кг стоит " + price*i/10.0);
        // }
    }
}
