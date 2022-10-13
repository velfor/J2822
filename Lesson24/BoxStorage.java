package Lesson24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Создать коллекцию, содержащую объекты класса HeavyBox.
Распечатать содержимое используя for each.
Изменить вес первого ящика на 1.
Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики.
 */
public class BoxStorage {
    private List<HeavyBox> listOfBoxes;

    public BoxStorage(){
        listOfBoxes = new ArrayList<>();
    }
    public BoxStorage(ArrayList<HeavyBox> listOfBoxes){
        //! НЕЛЬЗЯ !!!! this.listOfBoxes = listOfBoxes;
        //надо скопировать содержимое параметра в содержимое поля
        this();
        this.listOfBoxes.addAll(listOfBoxes);
    }

    @Override
    public String toString() {
        return "BoxTest{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }
    public boolean changeWeightOfBox(int index, int change){
        boolean result = true;
        if (index < 0 || index > listOfBoxes.size() - 1) result = false;
        if (!listOfBoxes.get(index).changeWeight(change)) result = false;
        return result;
    }
    public HeavyBox[] getArray(){return (HeavyBox[])listOfBoxes.toArray();}
}
