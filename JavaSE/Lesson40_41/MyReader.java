package Lesson40_41;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyReader implements Runnable{
    FileReader fr;
    Object locker;

    public MyReader(String filePath, Object locker) {
        this.locker = locker;
        try{
            fr = new FileReader(filePath);
        }
        catch (FileNotFoundException ex){
            Logger.getLogger(MyReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        int lineCounter = 1;
        String str;
        BufferedReader br= new BufferedReader(fr);
        try{
            while((str = br.readLine()) != null){
                System.out.println("Reader:" + str);
                if (lineCounter % 2 != 0){
                    synchronized (locker){
                        Testsynchro.line = str;
                        locker.notify();
                        locker.wait();
                    }

                }
                lineCounter++;
            }
            synchronized (locker){
                Testsynchro.line = "exit";
                locker.notify();
                locker.wait();
            }
        }
        catch (IOException ex){
            Logger.getLogger(MyReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (InterruptedException ex){
            Logger.getLogger(MyReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
                fr.close();
            }
            catch (IOException ex){
                Logger.getLogger(MyReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
