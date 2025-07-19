package LeetCode;

import javafx.util.Pair;

import java.util.*;

public class NextGreaterElement {
    private static void sop(Object a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean proceed = true;
        while (proceed) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            sop("Next Greaters ");
            Arrays.stream(nextGreaterElements(arr,"last")).forEach(m -> System.out.print(m+" "));
            sop("\nPress 'n' to exit, press 'y' to continue");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("y")) continue;
            break;
        }
    }

    private static int[] nextGreaterElements(int[] arr) {
        //left to right optional
        int n = arr.length;
        int[] res = new int[n];

        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && stack.peek().getKey() < arr[i]) {
                Pair<Integer,Integer> pair = stack.pop();
                res[pair.getValue()] = arr[i];
            }
            stack.push(new Pair<>(arr[i], i));
        }
        while (!stack.isEmpty()) {
            Pair<Integer,Integer> pair = stack.pop();
            res[pair.getValue()] =-1;
        }
        return res;
    }

    private static int[] nextGreaterElements(int[] arr,String direction) {
        //right to left solution
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i]) stack.pop();
            res[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return res;
    }
}
