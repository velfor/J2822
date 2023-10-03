package Lesson25;

public class Stack<T> implements Stackable<T>{
    private Node<T> head;

    Stack(){ head = null; }

    @Override
    //true если стек пустой, false если не пустой
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    //положить данные в стек
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    //прочитать данные с вершины стека
    // если стек пустой, то выбрасывает исключение
    // NullPointerException
    public T peek() throws NullPointerException{
        if(isEmpty())
            throw new NullPointerException("Stack is empty");
        return head.data;
    }

    @Override
    //удалить узел-вершину стека и вернуть данные
    //которые были в вершине
    public T pop() {
        T topData = peek();
        head = head.next;
        return topData;
    }

    @Override
    //преобразовать стек в строку
    public String toString() {
        Node<T> current = head;
        StringBuilder buf = new StringBuilder();
        while(current != null){
            buf.append(current.data);
            buf.append(" ");
            current = current.next;
        }
        return buf.toString();
    }
}
