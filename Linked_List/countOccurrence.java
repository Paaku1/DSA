package Linked_List;

public class countOccurrence {
    static int count(Node head, int val, int count) {
        if (head == null) {
            return count;
        }
        if (head.data == val) {
            return count(head.next, val, count + 1);
        }
        return count(head.next, val, count);
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        int val = 3;
        System.out.println(count(head, val, 0));
    }
}
