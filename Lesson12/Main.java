package Lesson12;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void fillRandom(ArrayList<Integer> mas, int left, int right, int qty) {
        Random gen = new Random();
        for (int i = 0; i < qty; i++) {
            mas.add(gen.nextInt(right - left + 1) + left);
        }
    }
    static void print(ArrayList<Integer> mas){
        for (int i = 0; i < mas.size(); i++) {
            System.out.print(mas.get(i) + " ");
        }
        System.out.println();
    }
    static int findPosMin(ArrayList<Integer> mas){
        int posMin = -1;
        if(mas.size() == 0) return posMin;
        int min = mas.get(0);
        for(int i = 0; i < mas.size(); i++){
            if(mas.get(i) < min){
                min = mas.get(i);// аналогия для массива mas[i]
                posMin = i;
            }
        }
        return posMin;
    }
    static int findPosMax(ArrayList<Integer> mas){
        int posMax = -1;
        if(mas.size() == 0) return posMax;
        int max = mas.get(0);
        for(int i = 0; i < mas.size(); i++){
            if(mas.get(i) > max){
                max = mas.get(i);
                posMax = i;
            }
        }
        return posMax;
    }
    static void swap(ArrayList<Integer> mas, int index1, int index2){
        int temp = mas.get(index1);//temp = mas[index1];
        mas.set(index1, mas.get(index2));//mas[index1] = mas[index2]
        mas.set(index2, temp);//mas[index2] = temp
    }
    static void initDeck(ArrayList<Integer> deck){
        for(int k = 0; k < 4; k++) {
            for (int i = 1; i < 10; i++) {
                deck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                deck.add(10);
            }
        }
    }
    static void shuffleDeck(ArrayList<Integer> deck){
        Random gen = new Random();
        for(int k = 0; k < 3; k++) {
            for (int i = 0; i < deck.size(); i++) {
                int randomIndex = gen.nextInt(deck.size());
                swap(deck, i, randomIndex);
            }
        }
    }

    public static void main(String[] args) {
        /*ArrayList<Integer> arr = new ArrayList<>();
        fillRandom(arr,-10, 10, 15);
        print(arr);
        //Найти позицию минимального элемента
        System.out.println(findPosMin(arr));
        //Найти позицию максимального элемента
        System.out.println(findPosMax(arr));
        //Поменять min max местами
        swap(arr, findPosMin(arr), findPosMax(arr));
        print(arr);*/
        ArrayList<Integer> deck = new ArrayList<>();
        initDeck(deck);
        print(deck);
        shuffleDeck(deck);
        print(deck);
    }
}
