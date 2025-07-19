package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CelebrityProblem {
    public static void main(String[] args) {
        System.out.println("Celebrity person -> "+celebrityTwoPointer(getRelations()));
    }

    private static List<List<Integer>> getRelations(){
        int [][] arr = { { 0, 1, 0 },
                         { 0, 1, 0 },
                         { 0, 1, 1 } };
        List<List<Integer>> knownList = Arrays.stream(arr)
                                        .map(m -> Arrays.stream(m).boxed().collect(Collectors.toList()))
                                        .collect(Collectors.toList());
        return knownList;
    }
    private static int celebrityTwoPointer(List<List<Integer>> knownList){
        int ans=-2;
        int n = knownList.size();
        int i=0,j=n-1;
        while(i<j){
            if(knownList.get(i).get(j)==1) i++;
            else j--;
        }
        //came out i is celebrity
        //now verify as well

        for(j=0;j<n;j++)
            if((j!=i && (knownList.get(j).get(i)==0 || knownList.get(i).get(j)==1)))
                ans = -1;

        return ans==-1?-1:i;
    }
}
