package LeetCode;

import java.util.*;

public class GroupAnagrams {

    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<String> strlist = new ArrayList<String>(size);
        while(size-->0){
            String str = sc.next();
            strlist.add(str);
        }
        System.out.println(anagramGroups(strlist).toString());
    }

    public static List<List<String>> anagramGroups(List<String> strlist){
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        System.out.println(strlist.size());
         for (String str:strlist){
             List<String> list = new ArrayList<>();
             String key = getkey(str);
             if(map.containsKey(key)) list = map.get(key);
                 list.add(str);
                 map.put(key,list);
         }
         List<List<String>> ans = new ArrayList<>();
         for (String key:map.keySet()) ans.add(map.get(key));
         return ans;
    }

    private static String getkey(String str){
        int []arr = new int[26];
        Arrays.fill(arr,0);
        for(char c:str.toCharArray()) arr[(int)c-'a']++;
        StringBuilder ans = new StringBuilder();
        for(int i:arr) ans.append(String.valueOf(i)+'%');
        return ans.toString();
    }
}
