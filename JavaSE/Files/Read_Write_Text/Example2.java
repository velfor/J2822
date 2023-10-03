package Read_Write_Text;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by velfor on 01.12.2022.
 * Читаем и пишем строки через FileReader и FileWriter
 */
public class Example2 {

    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("lines.txt");
            //fr = new FileReader("lines1251.txt");
            fw = new FileWriter("lines1.txt");//перезапись
            //fw = new FileWriter("lines1.txt", true);//дозапись
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while((line = br.readLine()) != null) {
                char buffer[] = new char[line.length()];
                line.getChars(0, line.length(), buffer, 0);
                for (int i=0; i < buffer.length; i ++) {
                    if(buffer[i]=='e')
                        fw.write('E');
                    else
                        fw.write(buffer[i]);
                }
                fw.write(System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example1.class.getName()).
                    log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(Example1.class.getName()).
                    log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Example1.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
