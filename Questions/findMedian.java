package AlogirthmsJava.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class findMedian {
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void addData(int n) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= n)
            maxHeap.add(n);
        else
            minHeap.add(n);

        // checking the space we need more terms in the maxHeap
        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if (minHeap.size() > maxHeap.size())
            maxHeap.add(minHeap.poll());

    }

    public static double median() {
        if (maxHeap.size() == minHeap.size())
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        addData(3);
        addData(1);
        System.out.println(median());
        addData(5);
        System.out.println(median());
        addData(4);
        System.out.println(median());
        addData(9);
        System.out.println(median());
    }
}
