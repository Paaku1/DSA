package tree.BinaryTree;

import java.util.*;

public class Tree {

    Node getTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }

    int height(Node node) { // height
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    int count(Node node) { // count
        if (node == null)
            return 0;
        return count(node.left) + count(node.right) + 1;
    }

    List<Integer> postOrder(Node node, ArrayList<Integer> result) {
        if (node == null)
            return result;
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.data);
        return result;
    }

    List<Integer> preOrder(Node node, ArrayList<Integer> result) {
        if (node == null)
            return result;
        result.add(node.data);
        preOrder(node.left, result);
        preOrder(node.right, result);
        return result;
    }

    List<Integer> InOrder(Node node, List<Integer> result) {
        if (node == null)
            return result;
        InOrder(node.left, result);
        result.add(node.data);
        InOrder(node.right, result);
        return result;
    }

    void traversalOrder(Node node) {
        for (int i = 1; i <= height(node); i++) {
            currentLevel(node, i);
            System.out.println();
        }
    }

    private void currentLevel(Node node, int i) { // Helper method
        if (node == null)
            return;
        if (i == 1)
            System.out.print(node.data + " ");
        else if (i > 1) {
            currentLevel(node.left, i - 1);
            currentLevel(node.right, i - 1);
        }
    }

    boolean contains(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.data == key) {
            return true;
        }

        boolean left = contains(node.left, key);
        if (left)
            return true;
        boolean right = contains(node.right, key);
        return right;
    }

    int parent(Node node, int target, int parent) {

        if (node == null) {
            return -1;
        }
        if (node.data == target) {
            return parent;
        }
        int left = parent(node.left, target, node.data);
        if (left != -1)
            return left;
        return parent(node.right, target, node.data);
    }

    void add(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                queue.add(current.left);
            } else {
                current.left = new Node(key);
                return;
            }
            if (current.right != null) {
                queue.add(current.right);
            } else {
                current.right = new Node(key);
                return;
            }
        }
    }

    Node createTree(int[] data) {
        Node node = new Node(data[0]);
        for (int i = 1; i < data.length; i++) {
            add(node, data[i]);
        }
        return node;
    }

    void delete(Node node, int key) {
        if (node == null) {
            return ;
        }
        if (node.left == null && node.right == null) {
            if (node.data == key) {
                return ;
            }
        }
        Deque<Node> queue = new LinkedList<Node>();
        queue.add(node);
        Node keyNode = null;
        Node current=null;
        while(!queue.isEmpty()) {
            current = queue.poll();
            if (current.data == key) {
                keyNode = current;
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
        }
        if(keyNode != null){
            int x = current.data;
            keyNode.data = x;
            deleteDeepest(node, current);
        }
    }

    void deleteDeepest(Node node,Node key){
        Deque<Node> queue = new LinkedList<>();
        queue.add(node);
        Node curr = null;
        while(!queue.isEmpty()){
            curr = queue.poll();
            if( curr == key){
                curr = null;
                key = null;
                return;
            }
            if( curr.left != null){
                if(curr.left == key){
                    curr.left = null;
                    key = null;
                    return;
                }
                queue.add(curr.left);
            }
            if( curr.right != null){
                if(curr.right == key){
                    curr.right = null;
                    key = null;
                    return;
                }
                queue.add(curr.right);
            }
        }
    }

}