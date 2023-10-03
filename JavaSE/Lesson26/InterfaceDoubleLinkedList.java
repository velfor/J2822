package Lesson26;

public interface InterfaceDoubleLinkedList<T> {
    boolean isEmpty();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
    void removeAll();
}
