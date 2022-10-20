package Lesson26;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList<String> str = new DoubleLinkedList<>();
        str.addLast("Vasya");
        str.addLast("Petua");
        str.addLast("Masha");
        //System.out.println(str.getLast());
        System.out.println(str);
    }
}
