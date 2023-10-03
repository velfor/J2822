package Lesson25;

interface UniQueue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();
}
