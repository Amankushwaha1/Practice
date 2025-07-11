// group Anagrams (solution) as well

package DSImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MergeSortImpl {

    public static void main(String[] args){
        printgroupAnagram();
    }

    public static String merge(String a, String b){
        int aLen = a.length();
        int bLen = b.length();
        int i=0,j=0;
        String res = "";
        while(i<aLen && j<bLen){
            if(a.charAt(i)<b.charAt(j)){
                res+=a.charAt(i);
                i++;
            }
            else {
                res+=b.charAt(j);
                j++;
            }
        }
        if(i<aLen) res+=a.substring(i);
        if(j<bLen) res+=b.substring(j);

        return res;
    }
    public static String mergesort(String str,int start,int end) {
        char[] chars = str.toCharArray();
        if(start == end) return String.valueOf(chars[end]);
//        if(end - start == 1) {
//            char temp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = temp;
//            return String.valueOf(chars[start])+String.valueOf(chars[end]);
//        }
        int mid = start + (end - start)/2;
        String a = mergesort(str,start,mid);
        String b = mergesort(str,mid+1,end);
        String sortedstr = merge(a,b);
        return sortedstr;
    }
    public static ArrayList<List<String>> groupAnagram() {
        ArrayList<List<String>> returnlist = new ArrayList<List<String>>();
        HashMap<String , List<String>> map = new HashMap<>();
        String[] str = {"acb", "cab" , "abcv","abgh","abhg","ttl"};

        for(String str1 : str){
            String sortstr1 = mergesort(str1,0,str1.length()-1);
            System.out.println(sortstr1);
            if(map.containsKey(sortstr1)) {
                List<String> temp = map.get(sortstr1);
                temp.add(str1);
                map.put(sortstr1,temp);
            }
            else {
                List<String> temp = new ArrayList<>();
                temp.add(str1);
                map.put(sortstr1,temp);
            }
        }

        for(List<String> list2 : map.values()) returnlist.add(list2);
        return returnlist;
    }

    public static void printgroupAnagram() {
        ArrayList<List<String>> groupAnagram = groupAnagram();
        for(List<String> list2 : groupAnagram) System.out.println(list2);
    }
}

