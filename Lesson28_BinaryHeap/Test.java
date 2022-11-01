package Lesson28_BinaryHeap;

public class Test {
    public static void main(String[] args) {
        Integer[] mas = {1, 3, 5, 6, 9, 7, 8, 11, 15, 20};

        BinaryHeap<Integer> bh1 = new BinaryHeap<>(mas);
        System.out.println(bh1.getElements());
    }
}
