package DSImplementation;

public class LinkedListNode<E> {
    E data;
    LinkedListNode<E> next;

    public LinkedListNode(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }
}
