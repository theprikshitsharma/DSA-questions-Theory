package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // // binary tree

        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.insert(sc);
        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        // bt.display();

        // // binary search tree

        BinarySearchTree bst = new BinarySearchTree();
        // int[] values = {5,3,7,2,4,1,7,6,8,9};
        // bst.populate(values);
        // bst.display();
        // int[] sortedValues = {1,2,3,4,5,6,7,8,9,10};
        // bst.populateSorted(sortedValues);
        // bst.display();
    }
}
