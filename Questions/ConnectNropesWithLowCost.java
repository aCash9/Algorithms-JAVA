package AlogirthmsJava.Questions;

import java.util.PriorityQueue;

public class ConnectNropesWithLowCost {
    public static int helper(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int sum = 0;
        for (int i : a)
            q.add(i);

        while (q.size() > 1) {
            int first = q.poll();
            int second = q.poll();
            int total = first + second ; 
            sum+=total;
            q.add(total);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 2, 5, 4, 8, 6, 9 };
        System.out.println(helper(a));
    }
}
