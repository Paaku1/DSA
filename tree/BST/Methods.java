package tree.BST;

class Methods {

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    int getHeight(Node node){
        if(node == null){
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
    }

    int getCount(Node node){
        if(node == null){
            return 0;
        }
        return getCount(node.left) + getCount(node.right) + 1;
    }

    
}
