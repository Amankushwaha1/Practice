package LeetCode;

import java.util.Scanner;

public class RainWaterTrap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        while (n-- > 0) {
            arr[n] = sc.nextInt();
        }
        sc.close();

        System.out.println("Max rain water = "+maxWaterAny2Points(arr));
        System.out.println("Max rain water = "+totalWater(arr));
    }

    public static int maxWaterAny2Points(int[] arr) {
        int end = arr.length-1, start = 0;
        int maxwater = 0;
        while(start <= end) {
            maxwater = Math.max(maxwater, (end - start) * Math.min(arr[start], arr[end]));
            if (arr[start] < arr[end]) start++;
            else end--;
        }
        return maxwater;
    }

    public static int totalWater(int[] arr) {
        int n = arr.length;
        int water = 0;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = arr[0]; right[n-1] = arr[n-1];
        for (int i = 1; i < n; i++) left[i] = Math.max(left[i-1],arr[i]);
        for (int i=n-2;i>=0;i--) right[i] =  Math.max(right[i+1],arr[i]);

        for(int i=0;i<n;i++)
            water+=Math.min(left[i],right[i]) - arr[i];

        return water;
    }
}
