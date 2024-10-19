package Linked_List;

public class identicalList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        identicalList a = new identicalList();
        a.add(1);
        a.add(2);
        a.print();
        identicalList b = new identicalList();
        b.add(1);
        b.add(2);
        // a.add(3);
        b.print();
        a.print();
        System.out.println(identical(a, b));
    }

    private static boolean identical(identicalList a, identicalList b) {
        if (a.head == null && b.head == null) {
            return false;
        } else {
            Node t1 = a.head;
            Node t2 = b.head;
            while (t1.next != null) {
                if (t1.data != t2.data || t1.next == null || t2.next == null) {
                    return false;
                }
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return true;
    }
}
