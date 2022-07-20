package stack;

import java.util.Stack;
import java.util.*;

public class reverseStack {
    static Stack<String> stack= new Stack<>();
    static Queue<String> queue= new LinkedList<>();


    public static void main(String[] args) {
        stack.push("7");
        stack.push("9");
        System.out.println(stack);
    while (!stack.isEmpty()){
        queue.add(stack.pop());
    }
        System.out.println(queue);
    System.out.println(stack);

    stack.push(queue.peek());
    queue.remove();
    stack.push(queue.peek());
    queue.remove();
        System.out.println(stack);
        System.out.println(queue);
    }
}
