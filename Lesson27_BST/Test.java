package Lesson27_BST;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        BST<Integer> t1 = new BST();
        t1.add(8);
        t1.add(5);
        t1.add(10);
        t1.add(6);
        t1.add(9);
        t1.add(12);
        t1.inorder();
        System.out.println(t1.contains(7));
        t1.delete(9);
        t1.preorder(t1.getRoot());
   }
}
