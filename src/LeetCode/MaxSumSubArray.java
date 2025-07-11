package LeetCode;

import java.util.Arrays;

public class MaxSumSubArray {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum,maxsum = sum = nums[0];
        for (int i = 1; i < n; i++) {
            if(sum < 0) sum=0;
            sum += nums[i];
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] arr = {-1,-2, 3,4,-7};
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(maxSubArray(arr));
    }
}
