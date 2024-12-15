package tree.BinaryTree;

import java.util.*;

public class BinaryTree {

    public static void main(String[] args) {

        Tree tree = new Tree();

        Node root = tree.createTree(new int[] { 1, 2, 3, 4, 5, 6});

        System.out.println("InOrderTree - Left -> Root -> Right\n" +
        tree.InOrder(root, new ArrayList<Integer>()));
        System.out.println("PreOrderTree - Root -> Left -> Right\n" +
        tree.preOrder(root, new ArrayList<Integer>()));
        System.out.println("PostOrderTree - Left -> Right -> Root\n" +
        tree.postOrder(root, new ArrayList<Integer>()));
        System.out.println("Tree Height: " + tree.height(root));
        System.out.println("No of Nodes: " + tree.count(root));

        System.out.println("Traversal order: ");
        tree.traversalOrder(root);

        System.out.println("Check if tree contains: " + tree.contains(root, 4));
        System.out.println("Check if tree contains: " + tree.contains(root, 8));
        System.out.println("Parent of Node: " + tree.parent(root, 4, -1));

        tree.add(root, 8);
        System.out.println("Traversal order: ");
        tree.traversalOrder(root);

        tree.delete(root, 1);

        System.out.println("Traversal order: ");
        tree.traversalOrder(root);


    }
}
