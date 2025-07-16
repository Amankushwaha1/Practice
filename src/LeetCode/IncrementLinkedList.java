package LeetCode;

import DSImplementation.LinkedListNode;
import DSImplementation.LinkedListUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncrementLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListUtil<Integer> linkedListUtil = new LinkedListUtil<>();
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        LinkedListNode<Integer> head = linkedListUtil.createLinkedList(list), cur=null;
        linkedListUtil.traverseLinkedList(head);
        //reverse the list
        head = linkedListUtil.reverseLinkedList(head);
        cur = head;
        boolean pending = true;
        while(pending) {
            if(cur.getData()==9)
                cur.setData(0);
            else {
                cur.setData(cur.getData()+1);
                pending = false;
                break;
            }
            if(cur.getNext()!=null)
                cur = cur.getNext();
            else {
                LinkedListNode<Integer> temp = new LinkedListNode<>(1);
                cur.setNext(temp);
                pending = false;
            }
        }
        head = linkedListUtil.reverseLinkedList(head);
        linkedListUtil.traverseLinkedList(head);

    }
}
