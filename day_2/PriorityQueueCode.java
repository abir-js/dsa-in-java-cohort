package day_2;

import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueCode {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(10);
        pq.offer(30);
        pq.offer(40);
        pq.offer(20);

        System.out.println(pq);
    }
}
