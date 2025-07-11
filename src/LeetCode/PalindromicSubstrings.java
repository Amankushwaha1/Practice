package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static LeetCode.PalindromicSubstrings.countPalindrome;
import static LeetCode.PalindromicSubstrings.sop;

//Had to count no of palindromic substrings with length greater than 1

public class PalindromicSubstrings {

    public static void sop(Object a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        sop("No of Palindromic Substring ->"+countPalindrome(s));
    }

    //Using Centre Expansion Technique
    public static int countPalindrome(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd length
            {
                int start = i-1, end = i+1;
                while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                    count++;
                    start--;
                    end++;
                }
            }
            //even length
            if(i>0 && s.charAt(i) == s.charAt(i-1)) {
                    count++;
                    int start = i-2, end = i+1;
                    while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                        count++;
                        start--;
                        end++;
                    }
                }

        }
//        sop("Result from code ->"+count);
        return count;
    }
}


//O(n^3)
// Java program to count all palindromic substring of
// given string by generating all possible substrings
class GfG {

    // Function to check if a substring
    // s[i..j] is a palindrome
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static int countPS(String s) {
        int n = s.length();

        // Consider all possible substrings of lengths
        // more than 1
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // If substring from i to j is palindrome
                // increment the result
                if (isPalindrome(s, i, j))
                    res++;
            }
        }
//        sop("Actual No of Palindromic Substring ->" + res);
        return res;
    }

    public static void main(String[] args) {
        List<String> palindromes = new ArrayList<String>();
        palindromes.add("abaab");
        palindromes.add("aaa");
        palindromes.add("abbaeae");
        palindromes.add("abaabyuiiririrnykjyyessssy");
        palindromes.add("webfwebfiehbfwefwehu");
        palindromes.add("www..bweibfwe14u0184ohqe");
        palindromes.add("bjwebfi3gri3r238yrfwev3re)))`###");

        int count = 0;
        for (String s : palindromes)
            if (countPS(s) == countPalindrome(s)) count++;

        sop("No of Test Cases Passed = " + count + " , Out of = " + palindromes.size());

    }
}
