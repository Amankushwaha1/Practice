package LeetCode;
/*
Duplicates in O(n) time and O(n) space Constraints
elements from 0 to n-1
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findDuplicate(int[] nums) {
        List<Boolean> visited = new ArrayList<>(Collections.nCopies(nums.length,false));
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
                if (visited.get(nums[i]-1)) duplicates.add(nums[i]);
                else visited.set(nums[i]-1, true);
            }
        return duplicates;
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};

        Iterable<Integer> list = findDuplicate(arr);
        System.out.println(list);
    }
}
