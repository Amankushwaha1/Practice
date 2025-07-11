package LeetCode;

import java.util.*;

public class SelfProduct {

    public static List<Integer> findSelfProduct(int[] arr) {
        int zeroCount = 0, zeroindex=-1, product = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {zeroCount++;zeroindex=i;}
            else product*=arr[i];
        }
        List<Integer> list = new ArrayList<>(Collections.nCopies(arr.length, 0));
        if(zeroCount == 0) for (int i = 0; i < arr.length; i++) list.set(i,product/arr[i]);
        else if (zeroCount == 1) list.set(zeroindex,product);

        return list;
    }
    public static List<Integer> findleftSelfProduct(int[] arr) {
        int zeroCount = 0;
        List<Integer> prefix = new ArrayList<>(Collections.nCopies(arr.length, 1));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                prefix.set(i, prefix.get(Math.max(i,1)-1));
            }
            else prefix.set(i, prefix.get(Math.max(i,1) - 1) * arr[i]);
        }
        List<Integer> result = new ArrayList<>(Collections.nCopies(arr.length, 0));
        for (int i = 0; i < arr.length; i++) {
            if (zeroCount == 0) result.set(i,prefix.get(i)/arr[i]);
            else if (zeroCount == 1 && arr[i]==0) result.set(i,prefix.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,2};

        System.out.println("Self Product: "+findSelfProduct(arr));
        Iterable<Integer> list = findleftSelfProduct(arr);
        System.out.println("Product from left:"+list);
    }
}
