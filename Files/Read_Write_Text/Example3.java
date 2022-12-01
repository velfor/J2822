package Read_Write_Text;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by velfor on 01.12.2022.
 */
public class Example3 {
    public static void main(String[] args) {
        try (FileInputStream fis =
                     new FileInputStream(new File("lines1251.txt"));
             InputStreamReader reader =
                     new InputStreamReader(fis, "windows-1251");
             FileOutputStream fs =
                     new FileOutputStream(new File("lines2.txt"));
             OutputStreamWriter writer =
                     new OutputStreamWriter(fs, "UTF-8")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
                writer.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example3.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example3.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
}
