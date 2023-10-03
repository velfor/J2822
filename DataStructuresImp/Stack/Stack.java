package Stack;
/**
 * Created by velfor on 17.10.2022.
 */

class Stack<T>
{
    private Node<T> top;

    public Stack() {this.top = null;}

    public void push(T data){
        Node<T> node = new Node<T>(data);
        node.next = top;
        top = node;
    }

    public boolean isEmpty() {return top == null;}

    public T peek() throws NullPointerException{
        // проверка на пустой stack
        //if (isEmpty())
         //   throw new NullPointerException("Stack is empty");
        return top.data;
    }

    public T pop(){
        T topData = peek();
        this.top = (this.top).next;
        return topData;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(50);
        Node<T> cur = top;
        while(cur != null){
            buf.append(cur.data);
            buf.append(" ");
            cur = cur.next;
        }
        return new String(buf);
    }
}

