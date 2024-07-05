package Linked_List;

import java.util.*;

public class testList {
    public static void main(String[] args) {
        List<List<Integer>> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(2);
        y.add(3);
        x.add(y);
        y = new ArrayList<>();
        y.add(4);
        y.add(5);
        y.add(6);
        y.add(7);
        x.add(y);
        System.out.println(x);
    }
}
