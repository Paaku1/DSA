package stack;

import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
