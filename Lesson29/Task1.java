package Lesson29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        final List<Integer> l1 = new ArrayList<>();
        final List<Integer> l2 = new ArrayList<>();
        for(int i = 1; i <=5; i++){
            l1.add(i);
        }
        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        l2.addAll(l1);
        l1.clear();

        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        Iterator<Integer> it = l2.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}
