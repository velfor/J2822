package Read_Write_Text;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by velfor on 01.12.2022.
 */
public class Example4 {

    public static void main(String[] args) {
        try (FileInputStream fis =
                     new FileInputStream(new File("lines.txt"));
             InputStreamReader reader =
                     new InputStreamReader(fis, "windows-1251");
        BufferedReader br=new BufferedReader(reader);
        FileOutputStream fs =
                new FileOutputStream(new File("lines2.txt"));
        OutputStreamWriter writer =
                new OutputStreamWriter(fs, "UTF-8");
        BufferedWriter bw=new BufferedWriter(writer)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line+System.getProperty("line.separator"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Example4.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Example4.class.getName()).
                    log(Level.SEVERE, null, ex);
        }

    }
}
