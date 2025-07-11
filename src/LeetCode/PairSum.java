package LeetCode;

import java.util.HashSet;

public class PairSum {

    public static boolean twoSum(int[] arr,int target) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target - arr[i])) return true;
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -10;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
