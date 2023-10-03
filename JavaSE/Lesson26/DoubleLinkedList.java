package Lesson26;


public class DoubleLinkedList<T>
        implements InterfaceDoubleLinkedList<T> {
    DLLNode<T> head;
    DLLNode<T> tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        DLLNode<T> curr = head;
        while(curr != null){
            buf.append(curr.data);
            buf.append(" ");
            curr = curr.next;
        }
        return buf.toString();
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    @Override
    public void addFirst(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (isEmpty()){
            //если список пустой
            //то новый узел одновременно и голова и хвост
            head = tail = newNode;
        }
        else{
            //связываем новый узел с головой
            newNode.next = head;
            //связываем голову с новым узлом
            head.prev = newNode;
            //новый узел становится головой
            head = newNode;
        }
    }

    @Override
    public void addLast(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (isEmpty()){
            //если список пустой
            //то новый узел одновременно и голова и хвост
            head = tail = newNode;
        }
        else{
            //связываем новый узел с хвостом
            newNode.prev = tail;
            //связываем хвост с новым узлом
            tail.next = newNode;
            //новый узел становится хвостом
            tail = newNode;
        }
    }

    @Override
    public void removeFirst() {
        if(!isEmpty()){
            if (head == tail) {head = tail = null;}
            else{
                head = head.next;
                head.prev.next = null;
                head.prev = null;
            }
        }
    }

    @Override
    public void removeLast() {
        if(!isEmpty()){
            if (head == tail) { head = tail = null;}
            else{
                tail = tail.prev;
                tail.next.prev = null;
                tail.next = null;
            }
        }
    }

    @Override
    public T getFirst() throws NullPointerException{
       if (isEmpty()) throw new NullPointerException("List is empty");
       return head.data;
    }

    @Override
    public T getLast() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return tail.data;
    }

    @Override
    public void removeAll() {
        DLLNode<T> curr = head;
        while(curr != null){
            curr = curr.next;
            curr.prev.next = null;
            curr.prev = null;
        }
        head = tail = null;
    }
}
