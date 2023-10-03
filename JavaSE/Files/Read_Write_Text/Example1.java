package Read_Write_Text;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by velfor on 01.12.2022.
 * Читаем и пишем строки через FileReader и FileWriter
 */
public class Example1 {

    public static void main(String[] args){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("lines.txt");
            //fw = new FileWriter("lines1.txt");//перезапись
            fw = new FileWriter("lines1.txt", true);//дозапись
            BufferedReader br = new BufferedReader(fr);
            String line="";
            int lineCounter=0;
            while((line = br.readLine()) != null) {
                if( (lineCounter++) % 2 == 0) {
                    System.out.println(line);
                    fw.write(line+System.getProperty("line.separator"));
            //System.getProperty("line.separator") returns the OS dependent
            // line separator.
            //On Windows it returns "\r\n", on Unix, Linux and MacOS X "\n",
            // "\r" (MacOS 9 and older) So if you want
            // to generate a file with line endings for the current
            // operating systems use System.getProperty("line.separator")

                }
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
