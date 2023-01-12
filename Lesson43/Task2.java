package Lesson43;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Задание 2
Для набора названий городов (города могут повторяться) нужно:
■ Показать все города;
■ Показать все города с названием длиннее шесть символов;
■ Посчитать сколько раз встречается город, чье название ввёл пользователь;
■ Показать все города, которые начинаются на заданную букву;
 */
public class Task2 {
    public static void main(String[] args) {


        List<String> towns = new ArrayList<>(List.of("Минск", "Гомель", "Витебск", "Могилев", "Гродно", "Брест", "Бобруйск",
                "Барановичи", "Борисов", "Пинск", "Орша", "Мозырь", "Лида", "Солигорск", "Полоцк"));
        Random gen = new Random();
        List<String> dupTowns = new ArrayList<>();
        final int dupSize = 30;
        for (int i = 0; i < dupSize; i++) {
            dupTowns.add(towns.get(gen.nextInt(towns.size())));
        }
        System.out.println(dupTowns);
        dupTowns.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        dupTowns.stream().filter(x -> x.length() > 6).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(dupTowns.stream().filter(x -> x.equals("Минск")).count());
        dupTowns.stream().filter(x -> x.charAt(0) == 'М').forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
