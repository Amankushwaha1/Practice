package LeetCode;

import java.util.Locale;
import java.util.Scanner;

public class SentencePalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(isPalin(sentence.toLowerCase()));
    }
    public static boolean isPalin(String sentence){
        int start = 0, end = sentence.length()-1;
        while(start < end){
            char s = sentence.charAt(start);
            char e = sentence.charAt(end);

            if(s<'a' || s>'z') start++;
            else if(e<'a' || e>'z') end--;
            else if( s!=e) return false;
            else {start++; end--;}
        }
        return true;
    }


//        public static void main(String[] args) {
//            String originalString = "Abc 012..##  10cbA";
//            String lowercasedString = originalString.toLowerCase();
//            System.out.println(lowercasedString); // Output: hello world
//        }
    }

