package Stack_Queue_HashMap.Stack_Queue;

import java.util.*;

public class Program2 {

    public static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        sort(stack);
        sorted(stack, top);
    }
    private static void sorted(Stack<Integer> s, int ele) {
        if (s.isEmpty() || s.peek() <= ele) {
            s.push(ele);
            return;
        }
        int top = s.pop();
        sorted(s, ele);
        s.push(top);
    }
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        sort(stack);
        while (!stack.isEmpty()) 
        {
            System.out.print(stack.pop() + " ");
        }
    }
}
