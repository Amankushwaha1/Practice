package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class ChocoDistribute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        System.out.println(chocoDistribute(arr, m));
    }

    private static int chocoDistribute(int[] arr, int m) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int j = m-1; j < n ;j++) diff = Math.min(diff, arr[j] - arr[j - m +1]);
        return diff==Integer.MAX_VALUE?-1:diff;
    }
}
