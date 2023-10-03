package Lesson29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        String text = "";
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try{
            text = buf.readLine();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        String[] wordsAsArray = text.split(" ");
        List<String> wordsAsList = Arrays.asList(wordsAsArray);
        String answer="";
        do{
            System.out.println("Введите up или down");
            try{
                answer = buf.readLine();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }while(!(answer.equals("up") || answer.equals("down")));
        if(answer.equals("down")) {
            Collections.reverse(wordsAsList);
        }
        System.out.println(wordsAsList);
    }
}
