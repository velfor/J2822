package Lesson35;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example2 {
    public static void main(String[] args) {
        final String inputFileName = "lines.txt";
        final String outputFileName = "lines2.txt";
        try(
                FileReader fr = new FileReader(inputFileName);
                FileWriter fw = new FileWriter(outputFileName);
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw)
        )
        {
            String line = "";
            while ( (line = br.readLine())!= null){
                char[] buffer = new char[line.length()];
                line.getChars(0, line.length(), buffer, 0);
                for(int i = 0; i < buffer.length; i++) {
                    if (buffer[i] == 'e') {
                        buffer[i] = Character.toUpperCase(buffer[i]);
                    }
                }
                System.out.println(buffer);
                bw.write(buffer+System.getProperty("line.separator"));
                bw.flush();
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Example1.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        catch (IOException ex){
            Logger.getLogger(Example1.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

    }
}
