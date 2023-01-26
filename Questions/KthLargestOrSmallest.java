package AlogirthmsJava.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestOrSmallest {
    
    static int KthLargest(int[] a, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 1; i <= k; i++) {
            q.add(a[i]);
        }
        for (int i = k+1; i < a.length; i++) {
            if(q.peek()<a[i]){
                q.poll();
                q.add(a[i]);
            }
        }
        return q.peek();
    }
    static int KthSmallest(int[] a, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i <= k; i++) {
            q.add(a[i]);
        }
        for (int i = k+1; i < a.length; i++) {
            if(q.peek()>a[i]){
                q.poll();
                q.add(a[i]);
            }
        }
        return q.peek();
    }
    public static void main(String[] args) {
        int[] a = { 0, 50, 20, 30, 10, 60, 40 };
        System.out.println(KthLargest(a,3));
        System.out.println(KthSmallest(a,3));
    }
}
