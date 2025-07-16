package DSImplementation;

import java.util.List;

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

    public LinkedListNode<E> createLinkedList(List<E> data) {
        int size = data.size();
        LinkedListNode<E> head = null, tail = null,temp = null;
        for (int i = 0; i < size; i++) {
            temp = new LinkedListNode<>(data.get(i));
            if (head == null) head = tail = temp ;
            else {
                tail.setNext(temp);
                tail = temp;
            }
        }
        return head;
    }

    public LinkedListNode<E> middleNode(LinkedListNode<E> head) {
        LinkedListNode<E> slow = head, fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

}

