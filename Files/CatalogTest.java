package Files;
import java.io.File;
import java.io.IOException;
public class CatalogTest {
    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("D://111//333");
        boolean created = dir.mkdir();
        if(created)
            System.out.println("Folder has been created");
        else
            System.out.println("Folder has not been created");
        // переименуем каталог
        File newDir = new File("D://111//333_1");
        boolean renamed = dir.renameTo(newDir);
        if (renamed)
            System.out.println("Folder has been renamed");
        else
            System.out.println("Folder has not been renamed");
        // удалим каталог
        boolean deleted = newDir.delete();
        if(deleted)
            System.out.println("Folder has been deleted");
        else
            System.out.println("Folder has not been deleted");


    }
}
