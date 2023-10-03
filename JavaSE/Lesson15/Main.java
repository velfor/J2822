package Lesson15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static void initField(char[][] field){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++){
                field[i][j] = ' ';
            }
        }
    }
    static void printLineSeparator(){
        for (int k = 0; k < 3; k++) {
            System.out.print("|---");
        }
        System.out.println('|');
    }
    static void printField(char[][] field){
        for(int i = 0; i < field.length; i++) {
            printLineSeparator();
            for(int j = 0; j < field[i].length; j++){
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println('|');
        }
       printLineSeparator();
    }
    static void turn(char[][] field, char symbol){
        Scanner in = new Scanner(System.in);
        int row = 0;
        int column = 0;
        do{
            System.out.print("Введите номер строки ");
            row = in.nextInt();
            System.out.print("Введите номер столбца ");
            column = in.nextInt();
        }while(row < 0 || row > 2 || column < 0 || column > 2 || field[row][column]!= ' ');

        field[row][column] = symbol;
    }
    static boolean checkWin(char[][] field, char symbol){
        boolean result = false;
        //если в любой строке три одинаковых символа
        for(int i = 0; i < field.length; i++){
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][2] == symbol){
                result = true;
                break;
            }
        }
        //если в любом столбце три одинаковых символа
        for(int j = 0; j < field[0].length; j++){
            if(field[0][j] == field[1][j] && field[1][j] == field[2][j]&& field[2][j] == symbol){
                result = true;
                break;
            }
        }
        //если на главной диагонали три одинаковых символа
        if(field[0][0] == field[1][1] && field[1][1] == field[2][2]&& field[2][2] == symbol)
            result = true;
        //если на побочной диагонали три одинаковых символа
        else if(field[0][2] == field[1][1] && field[1][1] == field[2][0]&& field[2][0] == symbol)
            result = true;
        return  result;
    }
    static boolean checkDraw(char[][] field){
        boolean result = true;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if (field[i][j] == ' '){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
       /*
        //Matrix20. Дана матрица размера M × N. Для каждого столбца матрицы найти
        //произведение его элементов.
        final int n = 3;
        final int m = 3;
        int[][] mas = new int[n][m];
        fillMatrix(mas);
        System.out.println(Arrays.deepToString(mas));
        //task20(mas);
        //Найти сумму элементов главной диагонали матрицы
        System.out.println(taskL1(mas));*/
        final char symbolX = 'X';
        final char symbolO = 'O';
        final int size = 3;
        char[][] field = new char[size][size];
        //сделать пустое поле - заполнить его пробелами
        initField(field);
        printField(field);
        //игровой цикл
        while(true) {
            //ход крестиков
            turn(field,symbolX);
            //вывести поле
            printField(field);
            //если победа крестиков - конец игры - прервать цикл
            if (checkWin(field,symbolX)){
                System.out.println("Выиграли крестики");
                break;
            }
            //ничья - конец игры - прервать цикл
            if (checkDraw(field)){
                System.out.println("Ничья");
                break;
            }
            //ход ноликов
            turn(field,symbolO);
            //вывести поле
            printField(field);
            //если победа ноликов - конец игры - прервать цикл
            if (checkWin(field,symbolO)){
                System.out.println("Выиграли нолики");
                break;
            }
            //ничья - конец игры - прервать цикл
            if (checkDraw(field)){
                System.out.println("Ничья");
                break;
            }
        }
    }
}
