package Read_Write;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int k1 = 0;
        int k2 = 9;
        newFile( k1, k2);
    }


    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");

        for(int i = k1; i <= k2; i++) {

            nFile.write(i+'0');

        }

        nFile.close();
    }
}
