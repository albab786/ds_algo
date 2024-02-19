package com.practise.tree;


 class Node{
    int data;
    Node left;
    Node right;
    public Node(int value) {
        data = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        preorderTraversal(tree.root);

    }
    public static void preorderTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
}
