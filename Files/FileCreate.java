package Files;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class FileCreate {
    static Logger LOGGER;//создаем логер
    //статическая инициализация
    static {
        try(FileInputStream ins = new FileInputStream("D:\\111\\log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(FileCreate.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }

    public static void getDirs(@NotNull String dir){
        File cat = new File(dir);
        for(File item : cat.listFiles()){
            if(item.isDirectory()){
                System.out.println(item.getName() + " \tкаталог");
                getDirs(item.getAbsolutePath());
            }
        }
    }
    public static void createFile(){
        String fileName = "test.txt";
        String fullName = "";
        String dirName = System.getProperty("user.dir");
        fullName = dirName + File.separator + fileName;
        System.out.println("File path : " + fullName);
        File file = new File(fullName);
        if(!file.exists()){
            try {
                if (file.createNewFile()){
                    //System.out.println("File created");
                    LOGGER.log(Level.INFO, "Cмогли создать файл");
                }
                else{
                    System.out.println("Something wrong");
                }
            } catch (IOException ex) {
                //ex.printStackTrace();
                LOGGER.log(Level.SEVERE, "Не смогли создать файл",ex);

            }
        }
    }
    public static void main(String[] args) {
/*
        // определяем объект для каталога
        File myFile = new File("D://111//notes.txt");
        System.out.println("File name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File("D://111//MyFile");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        getDirs("D://111//");
*/
        createFile();
    }
}
