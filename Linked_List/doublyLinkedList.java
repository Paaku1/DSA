package Linked_List;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
    Node(){
        
    }
}

public class doublyLinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        Node x = new Node();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.print();
    }
}
