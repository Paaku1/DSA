package Linked_List;

import java.util.*;

public class frequency<T> {

    Node<T> head;

    void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Map<Integer, Integer> freq() {
        Map<Integer, Integer> map = new HashMap<>();
        Node<T> temp = head;
        while (temp != null) {
            map.put(temp.data, map.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }
        return map;
    }

    public static void main(String[] args) {
        frequency<Integer> list = new frequency<>();
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
