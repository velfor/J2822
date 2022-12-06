package Lesson36;

import java.io.*;

public class Example1 {
    public static void writeObject(Object obj, String fileName){
        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeObjectEx(FishEx obj, String fileName){
        try(FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            obj.writeExternal(oos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject(String fileName){
        Object obj = null;
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
            obj = ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static Object readObjectEx(String fileName){
        FishEx obj = new FishEx();
        try(FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis))
        {
            obj.readExternal(ois);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    public static void main(String[] args) {
        /*Fish salmon = new Fish("salmon", 1000, 39.99);
        writeObject(salmon, "fish.txt");
        Fish newFish = (Fish)readObject("fish.txt");
        System.out.println(newFish);*/

        FishEx shark = new FishEx("shark", 500, 89.00);
        writeObjectEx(shark, "fishex.txt");
        FishEx newFishEx = (FishEx)readObjectEx("fishex.txt");
        System.out.println(newFishEx);
    }
}
