package LeetCode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import static java.util.Collections.swap;

public class ConsecutiveRemoval {

    public static void sop(Object str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int k = sc.nextInt();
        int k = 3;
        int [] arr = {0,1,1,3,2,2,2,3,3,3,1,1,0};
        sop("Process Started");
        System.out.println(removeConsecutive(arr,k));
    }

    public static List<Integer> removeConsecutive(int[] arr, int k) {
        Stack<Pair<Integer,Integer>> st = new Stack<>();
        int count;
        for (int i = 0; i < arr.length; i++) {
            sop(i+" = "+arr[i]);
            if(!st.isEmpty() && st.peek().getKey() == arr[i]) {
                count = st.peek().getValue() +1;
                st.pop();
                st.push(new Pair<>(arr[i],count));
            }
            else {
                if(!st.isEmpty() && st.peek().getValue() >= k) st.pop();
                if(!st.isEmpty() && st.peek().getKey() == arr[i]) {
                    count = st.peek().getValue() +1;
                    st.pop();
                    st.push(new Pair<>(arr[i],count));
                }
                else
                st.push(new Pair<>(arr[i],1));
            }
        }
        if(!st.isEmpty() && st.peek().getValue() >= k) st.pop();

        List<Integer> res = new ArrayList<>();
        while (!st.isEmpty()) {
            for(int i=0;i<st.peek().getValue();i++)
            res.add(st.peek().getKey());
            st.pop();
        }
        for(int i=0;i<res.size()/2;i++) {
            int temp = res.get(i);
            res.set(i,res.get(res.size()-i-1));
            res.set(res.size()-i-1,temp);
        }

        return res;
    }
}
