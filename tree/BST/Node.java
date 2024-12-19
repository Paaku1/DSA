package tree.BST;

import java.util.*;

public class Node extends Methods {
    Integer data;
    Node left, right;
    Node root;

    Node(Integer data) {
        this.data = data;
        left = right = null;
    }

    Node() {
        this(null);
    }

    int height() {
        return getHeight(root);
    }

    int count() {
        return getCount(root);
    }

    void add(int[] data) {
        for (int i : data) {
            add(i);
        }
    }

    void add(int data) {
        root = insert(root, data);
    }

    void traverse() {
        if (root == null)
            return;
        Deque<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
}
