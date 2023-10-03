package Stack;

/**
 * Created by velfor on 17.10.2022.
 */
class Node <T>
{
    T data;       // данные
    Node<T> next; // ссылка на следующий узел

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
