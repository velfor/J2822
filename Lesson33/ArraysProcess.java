package Lesson33;

import java.util.function.Predicate;

public class ArraysProcess {
    public static int arrayProcess(int[] arr, Predicate<Integer> predicate){
        int sum = 0;
        for(Integer elem:arr){
            if(predicate.test(elem)){
                sum += elem;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        /*
        Метод находит сумму элементов массива, которые
        соответствуют условию лямбда-выражения. Варианты
        лямбда-выражений:
        ■ Проверка на четность;
        ■ Проверка на нечетность;
        ■ Число находится в диапазоне от A до B;
        ■ Проверка на кратность параметру A.
        */
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(arrayProcess(arr, x -> x %2 == 0));
        int a = 1;
        int b = 4;
        System.out.println(arrayProcess(arr, x ->  x >= a  && x <= b));
        System.out.println(arrayProcess(arr, x ->  x % b == 0));
    }
}
