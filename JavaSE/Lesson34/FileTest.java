package Lesson34;

import Files.FileCreate;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FileTest {
    static Logger LOGGER;//cтатический логгер
    static
    {
        try(FileInputStream ins = new FileInputStream("D://111//log.config")){
           LogManager.getLogManager().readConfiguration(ins);
           LOGGER = Logger.getLogger(FileTest.class.getName());
        }
        catch(IOException ex){
            ex.getMessage();
        }
    }
    public static void createFile(){
        String fileName = "test.txt";
        String folderName = System.getProperty("user.dir");
        String fullName = folderName + File.separator + fileName;
        File file = new File(fullName);

        if(!file.exists()){
            try{
                if (file.createNewFile()){
                    LOGGER.log(Level.INFO, "Создали тестовый файл");
                }
                else{
                    LOGGER.log(Level.INFO, "Не создали тестовый файл");
                }
            }
            catch(IOException ex){
                LOGGER.log(Level.SEVERE, "Ошибка системы ввода-вывода", ex);
            }
        }
        else{
            LOGGER.log(Level.INFO, "Файл существует");
        }

    }

    public static void getFileList(String path){
        File folder = new File(path);
        for (File item : folder.listFiles()) {
            if (item.isDirectory()) {
                System.out.println(item.getAbsolutePath());
                System.out.println(Arrays.toString(item.listFiles(File::isDirectory)));
                System.out.println(Arrays.toString(item.listFiles(File::isFile)));
                getFileList(item.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        //createFile();
        getFileList("D:/demo");
    }

}
