package Linked_List;
import java.io.*;

class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}
public class testList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next; //goes to the end of the list
            }
            temp.next = newNode;
        }
    }
    public void insertHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertPos(int data,int pos){
        Node newNode = new Node(data);
        if(pos==0 || head == null){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i=1; i<pos && temp.next!= null;++i){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        testList list = new testList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();
        list.insertHead(0);
        list.print();
        list.insertPos(5,2);
        list.print();
    }
}
