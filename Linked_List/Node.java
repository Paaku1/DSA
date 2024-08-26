package Linked_List;

public class Node {
    int data;
    Node next;

    Node() {}
    Node(int d) {
        data = d;
        next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
