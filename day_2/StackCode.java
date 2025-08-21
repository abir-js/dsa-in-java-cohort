package day_2;

import java.util.Stack;

public class StackCode {

    public static void main(String[] args) {
        //Stack
        Stack<Integer> stackList = new Stack<>();
        stackList.push(10);
        stackList.push(20);
        stackList.push(30);

        System.out.println(stackList);
        System.out.println(stackList.peek());
        System.out.println(stackList.pop());
        System.out.println(stackList);

    }
}