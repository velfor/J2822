package BinaryHeap;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@Test
public class Test {

    public void main(String[] args) throws Exception {
        BinaryHeap heap = new BinaryHeap(new int[] {});
        heap = new BinaryHeap(new int[]{2, 42, 525, 35, 63, 81});

        for (int i : heap.getElements()) {
            System.out.print(i + " ");
        }
        System.out.println();

        heap.getElements()[0] = 1241251;
        assertEquals(heap.getElements()[0], 525);

        heap.add(2425);
        heap.add(1);

        List<Integer> numbers = new ArrayList<>();
        while (!heap.isEmpty()) {
            numbers.add(heap.extractMax());
        }
//        numbers.forEach(e -> System.out.print(e + " "));

        assertEquals((int) numbers.get(0), 2425);
        assertEquals((int) numbers.get(1), 525);
        assertEquals((int) numbers.get(2), 81);
        assertEquals((int) numbers.get(3), 63);
        assertEquals((int) numbers.get(4), 42);
        assertEquals((int) numbers.get(5), 35);
        assertEquals((int) numbers.get(6), 2);
        assertEquals((int) numbers.get(7), 1);
    }

    /*@org.junit.Test
    public void add() {
    }

    @org.junit.Test
    public void extractMax() {
    }

    @org.junit.Test
    public void isEmpty() {
    }

    @org.junit.Test
    public void getElements() {
    }

    @org.junit.Test
    public void all() {
    }*/
}
