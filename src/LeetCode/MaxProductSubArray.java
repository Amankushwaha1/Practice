package LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class MaxProductSubArray
{
    public static ArrayList<Integer> maxProduct(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int maxprod = Integer.MIN_VALUE;
        int minprod = Integer.MAX_VALUE;
        int currmin=1, currmax=1;
        for(Integer i:arr){
            if(i!=0){
                int temp =Math.max(Math.max(i*currmin,i*currmax),i);
                currmin=Math.min(Math.min(i*currmin,i*currmax),i);
                currmax=temp;
                maxprod = Math.max(maxprod,currmax);
                minprod = Math.min(minprod,currmin);
            }
        }
        result.add(minprod);
        result.add(maxprod);
        return result;
    }

    public static void main(String[] args){
        int arr[] = {1,-2,3,-4};
        System.out.println(maxProduct(arr));
    }
}
