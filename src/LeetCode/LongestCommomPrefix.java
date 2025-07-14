package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommomPrefix {

    private static void sop(Object a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;

        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) arr[j] = sc.next();
            count+= (longestCommonPrefix(arr).equals(commonPrefixTwo(arr)))?1:0;
        }
        sop("Test Cases passed " + count + " out of " + k);
    }

    private static String commonPrefixTwo(String[] arr) {
        int n = arr.length;
        int m = arr[0].length();
        for(String s : arr) m=Math.min(m, s.length());
        String res = "";
        boolean flag = true;

        for(int j=0;j<m;j++) {
            char ch= arr[0].charAt(j);
            for (int i = 1; i < n; i++) {
                    if (ch != arr[i].charAt(j)) flag = false;
                }
            if(flag) res+=ch;
            else break;
            }
        sop("n*m Result ->"+res);
        return res;
        }


    //Using Sorting Strings and Comparing First & Last Strings O(n*m*logn)
    static String longestCommonPrefix(String[] arr){

        // Sort the array of strings
        Arrays.sort(arr);

        // Get the first and last strings after sorting
        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(),
                last.length());

        // Find the common prefix between the first
        // and last strings
        int i = 0;
        while (i < minLength &&
                first.charAt(i) == last.charAt(i)) {
            i++;
        }

        // Return the common prefix
        sop("Sort Result -> "+first.substring(0,i));
        return first.substring(0, i);
    }
}
