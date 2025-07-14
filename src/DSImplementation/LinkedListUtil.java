package DSImplementation;

public class LinkedListUtil<E> {

    private void sop(Object o) {
        System.out.println(o);
    }

    private void sopnode(Object o) {
        System.out.print(o+"->");
    }
    public void traverseLinkedList(LinkedListNode<E> head) {
        while (head != null) {
            sopnode(head.getData());
            head = head.getNext();
        }
        sop("NULL");
    }

    public LinkedListNode<E> reverseLinkedList(LinkedListNode<E> head) {
        //Iterative reversal
        LinkedListNode<E> cur= head, prev = null, next;
        while (cur != null) {
            //temp assign next
            next = cur.getNext();

            //point back
            cur.setNext(prev);

            //move pointers
            prev = cur;
            cur = next;
        }
        return prev;
    }

}

