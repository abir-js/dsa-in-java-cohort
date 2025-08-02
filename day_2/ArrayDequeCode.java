package day_2;

import java.util.*;
public class ArrayDequeCode {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10);
        adq.offerFirst(20);
        adq.offerLast(30);
        adq.offer(40);
        adq.offerLast(50);
        adq.offer(60);

        //  20, 10, 30, 40, 50, 60
        System.out.println(adq);
        System.out.println(adq.peek()); // gets first - 20
        System.out.println(adq.poll()); // removes first- 20
        System.out.println(adq.pollLast()); // removes Last - 60 
        System.out.println(adq.pollFirst()); // removes first - 10
        System.out.println(adq.peekLast()); // gets last - 50
        System.out.println(adq);

        // 30, 40, 50,
    }
}
