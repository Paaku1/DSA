package Linked_List;
import java.util.*;

public class frequency {

    Node head;

    void add(int data) {
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

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Map<Integer,Integer> freq(){
        Map<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            map.put(temp.data,map.getOrDefault(temp.data,0)+1);
            temp = temp.next;
        }
        return map;
    }

    public static void main(String[] args) {
        frequency list = new frequency();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        System.out.println(list.freq());
    }
}
