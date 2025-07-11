package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestSubString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        System.out.println("Smallest SubString -> "+smallestSubstring(s,p));
    }

    public static String smallestSubstring(String s,String p){
        String res = "-1";
        int len = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            while(satisfied(start,end,s,p)) {
                if((end-start+1) < len){
                    len = end-start+1;
                    res = s.substring(start, end+1);
                }
                start++;
            }
            end++;
        }
        return res;
    }

    public static boolean satisfied(int start,int end,String s,String p){
//        System.out.println("Start -> "+start +" End -> "+end);
        List<Integer> arrs = new ArrayList<Integer>() ;
        List<Integer> arrp = new ArrayList<Integer>() ;
        for(int i=0;i<=26;i++) {
            arrs.add(0);
            arrp.add(0);
        }
        for(int i=start;i<=end;i++) arrs.set(s.charAt(i) - 'a',arrs.get(s.charAt(i) - 'a')+1);
        for(int j = 0;j<p.length();j++) arrp.set(p.charAt(j) - 'a',arrp.get(p.charAt(j) - 'a')+1);

        for(int i=0;i<=26;i++){
//            System.out.println("i = " +i+" s ->" +arrs.get(i)+" p-> "+arrp.get(i));
            if(arrp.get(i)!=0 && arrp.get(i)>arrs.get(i)) return false;
        }
//        System.out.println("Smallest SubString -> "+s.substring(start,end+1));
        return true;
    }
}
