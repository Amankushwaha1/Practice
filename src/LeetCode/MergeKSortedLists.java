package LeetCode;

import DSImplementation.LinkedListNode;
import DSImplementation.LinkedListUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MergeKSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<LinkedListNode<Integer>> list = new ArrayList<>();
        LinkedListUtil<Integer> intUtil = new LinkedListUtil<>();
        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            List<Integer> templist = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                templist.add(sc.nextInt());
            }
            list.add(intUtil.createLinkedList(templist));
        }
        for(LinkedListNode<Integer> head : list) intUtil.traverseLinkedList(head);

        intUtil.traverseLinkedList(mergeKlist(list));
    }

    private static LinkedListNode<Integer> mergeKlist(List<LinkedListNode<Integer>> list) {
        return mergeRecursively(0,list.size()-1,list);
    }

    private static LinkedListNode<Integer> mergeRecursively(int i,int j,List<LinkedListNode<Integer>> list) {
        int mid = i + (j - i) / 2;

        if(i==j) return list.get(mid);

        LinkedListNode<Integer> left = mergeRecursively(i,mid,list);
        LinkedListNode<Integer> right = mergeRecursively(mid+1,j,list);

        return mergeTwo(left,right);
    }

    private static LinkedListNode<Integer> mergeTwo(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
        LinkedListNode<Integer> head = new LinkedListNode<>(Integer.MIN_VALUE);
        LinkedListNode<Integer> cur = head;

        while (l1 != null && l2 != null) {
            if(l1.getData() < l2.getData()) {
                cur.setNext(l1);
                l1 = l1.getNext();
            }
            else {
                cur.setNext(l2);
                l2 = l2.getNext();
            }
            cur = cur.getNext();
        }
        if(l1 != null) cur.setNext(l1);
        if(l2 != null) cur.setNext(l2);

        head = head.getNext();
        return head;
    }
}
