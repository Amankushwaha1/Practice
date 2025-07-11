package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.min;

public class MinRotatedArray {

    public static int minelement(List<Integer> arr) {
        int start = 0 , end = arr.size() - 1, mid;
        while(end-start > 1) {
            mid = start + (end-start)/2;
            if(arr.get(mid) > arr.get(end)) start = mid;
            else end = mid;
        }
        return Math.min(arr.get(start),arr.get(end));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("The minimum element is " + minelement(arr));
    }

}
