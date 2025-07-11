package LeetCode;

import java.util.Scanner;

//Maximum consecutive repeating character in string
public class MaxRepeatedChar {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Max Repeated Character Length = "+maxrepeated(s));
    }
    public static int maxrepeated(String s){
        if(s.length()<=1) return 0;
        int ans = 1;
        int count = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) count++;
            else {
                ans = Math.max(ans,count);
                count = 1;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
