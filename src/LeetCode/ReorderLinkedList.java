package LeetCode;

import DSImplementation.LinkedListNode;
import DSImplementation.LinkedListUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReorderLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListUtil<Integer> listUtil = new LinkedListUtil<>();

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        LinkedListNode<Integer> head = listUtil.createLinkedList(list);
        listUtil.traverseLinkedList(head);

        int size = (list.size()+1)/2;
        LinkedListNode<Integer> mid = head , cur = head;
        for (int i = 0; i < size; i++) {
            mid = mid.getNext();
            if(i == size-1) cur.setNext(null);
            else cur = cur.getNext();
        }
//        listUtil.traverseLinkedList(head);
        mid = listUtil.reverseLinkedList(mid);
//        listUtil.traverseLinkedList(mid);
        listUtil.traverseLinkedList(mergeAlternate(head,mid));
    }

    private static LinkedListNode<Integer> mergeAlternate(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {

        LinkedListNode<Integer> head = first, tempfirst = first, tempsecond = second;
        while (first != null && second != null) {
            tempfirst = first.getNext();
            first.setNext(second);
            first = tempfirst;

            tempsecond = second.getNext();
            second.setNext(tempfirst);
            second = tempsecond;

        }

        return head;

    }
}
