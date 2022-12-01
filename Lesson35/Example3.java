package Lesson35;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Example3 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("lines1251.txt");
            InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
            FileOutputStream fos = new FileOutputStream("line3.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            )
        {
            int c;
            while( (c = isr.read()) != -1){
                System.out.print((char)c);
                osw.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
