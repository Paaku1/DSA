package tree.BST;

public class BST {
    public static void main(String[] args) {
        Node tree = new Node();
        int[] arr = { 3, 1, 2, 4, 5 };
        tree.add(arr);
        tree.traverse();
        System.out.println(tree.height());
        System.out.println(tree.count());
    }
}
