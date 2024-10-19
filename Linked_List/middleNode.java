package Linked_List;

public class middleNode {
    public static void main(String[] args) {
        Node head = new Node();
        head.add(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        head.add(6);
        head.add(7);
        getMiddle(head).print();
    }

    private static Node getMiddle(Node head) {
        int n = getLength(head);
        for (int i = 0; i < n / 2; i++) {
            head = head.next;
        }
        return head;
    }

    private static int getLength(Node head) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        return n;
    }
}
