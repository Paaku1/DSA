package Queue;

import java.util.*;

public class TestQueue {
    public static void main(String[] args) {
        Deque<String> q = new ArrayDeque<String>();
        q.add("Apple");
        q.add("Banana");
        q.add("Cherry");
        System.out.println(q.peek());

    }
}
