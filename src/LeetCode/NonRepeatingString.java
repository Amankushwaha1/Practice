package LeetCode;

import java.util.HashSet;
import java.util.Scanner;

public class NonRepeatingString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(nonRepeatingString(s));
    }

    public static int nonRepeatingString(String str) {
        if (str == null || str.length() == 0) return 0;
        int i,j,len = 1;
        i=0; j=1;

        HashSet<Character> set = new HashSet<Character>();
        set.add(str.charAt(0));
        while(j<str.length()){
            while(set.contains(str.charAt(j))){
                set.remove(str.charAt(i));
            i++;
            }
            set.add(str.charAt(j));
            len = Math.max(len, set.size());
            j++;
        }
        return Math.min(len,str.length());
    }
}
