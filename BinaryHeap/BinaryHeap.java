package BinaryHeap;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap {

    private int[] elements;

    public BinaryHeap(int[] elements) {
        this.elements = elements;
        for (int i = elements.length / 2 - 1; i >= 0; --i) {
            siftDown(i);
        }
    }

    public void add(int element) {
        int[] newElements = new int[elements.length + 1];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        newElements[newElements.length - 1] = element;
        elements = newElements;

        siftUp(elements.length - 1);
    }

    public int extractMax() {
        assert !isEmpty();

        int result = elements[0];
        elements[0] = elements[elements.length - 1];
        deleteLast();

        if (!isEmpty()) {
            siftDown(0);
        }

        return result;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }

    private void deleteLast() {
        if (elements.length > 1) {
            int[] newElements = new int[elements.length - 1];
            System.arraycopy(elements, 0, newElements, 0, elements.length - 1);
            elements = newElements;
        } else {
            elements = new int[0];
        }
    }

    private void siftDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;
        if (left < elements.length && elements[left] > elements[i]) {
            largest = left;
        }
        if (right < elements.length && elements[right] > elements[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            siftDown(largest);
        }


    }

    /**
     * Проталкивание элемента наверх
     * @param i - индес массива
     */
    private void siftUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (elements[i] < elements[parent])
                return;
            swap(i, parent);
            i = parent;
        }
    }




    private void swap(int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    public int[] getElements() {
        int[] elementsCopy = new int[elements.length];
        System.arraycopy(elements, 0, elementsCopy, 0, elements.length);
        return elementsCopy;
    }
    //@Test
    public void all() throws Exception {
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

}