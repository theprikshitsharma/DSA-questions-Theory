package BinaryTrees;

class BinarySearchTree {
    public class  Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }    
    private Node root;

    public BinarySearchTree() {

    }

    public int height(Node node) {
        return (node == null)? -1 : node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] values) {
        for (int value : values) {
            this.insert(value);
        }
    }

    public void populateSorted(int[] values) {
        populateSorted(values , 0 , values.length);
    }

    private void populateSorted(int[] values , int start , int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(values[mid]);

        populateSorted(values, start, mid); 
        populateSorted(values, mid + 1, end); 
    }

    public void insert() {
        root = insert(0, root);
    }

    public void insert(int value) {
        root = insert(value , this.root);
    }


    private Node insert(int value , Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left) ,height(node.right) + 1);

        return node;

    }




    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }




    public void display() {
        display(this.root , "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;
        System.out.println(details + node.value);
        display(node.left , "Left Child of " + node.value + " : ");
        display(node.right , "Right Child of " + node.value + " : ");
    }  

}
