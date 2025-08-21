package day_2;

import java.util.*;

public class QueueCode {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // * offer() => adds elements withot warning
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(50);
        q.offer(40);

        /*
         * poll() -> removes and returns head of Queue
         * peek() => gets head of Queue
         */

        System.out.println(q);
        System.out.println("poll: " + q.poll());
        System.out.println("after polling, value of queue: ");
        System.out.println(q);
        System.out.println("peek: " + q.peek());

    }
}
