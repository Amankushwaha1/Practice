package DSImplementation.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortusingpq(arr);
    }
    public static void sortusingpq(int[] arr) {
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n - 1; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            arr[i] = pq.poll();
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
