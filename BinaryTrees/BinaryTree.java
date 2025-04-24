package BinaryTrees;
import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node (int value) {
            this.value = value;
        }
    }
    
    private Node root;

    // insert element

    public void insert(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner, root);
    }

    private void insert(Scanner scanner, Node node) {
        System.out.println("Do you want to add on the left of the Node " + node.value);
        boolean doYouWantToAddOnTheLeftOfTheNode = scanner.nextBoolean();
        if (doYouWantToAddOnTheLeftOfTheNode) {
            System.out.println("Enter the value of left Node: ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner , node.left);
        }
        System.out.println("Do you want to add on the right of the Node " + node.value);
        boolean doYouWantToAddOnTheRightOfTheNode = scanner.nextBoolean();
        if (doYouWantToAddOnTheRightOfTheNode) {
            System.out.println("Enter the value of right Node: ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner , node.right);
        }
    }

    public void display() {
        display(this.root , 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right , level  + 1);
        if (level != 0) {
            for (int i = 0; i < level -  1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("------->" + node.value);
        }
        else {
            System.out.println(node.value);
        }
        display(node.left , level + 1);
    }
    
    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    } 
    
    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    } 
    
    public void postOrder() {
        postOrder(this.root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    } 

}
