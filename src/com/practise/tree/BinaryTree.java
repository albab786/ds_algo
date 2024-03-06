package com.practise.tree;


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
    static  Node root;

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
//        preorderTraversal(tree.root);
//        postOrderTraversal(tree.root);
//        inOrderTraversal(tree.root);
    //    iterativePreorder(tree.root);
        System.out.println(maxDepth(tree.root));

    }
    public static void preorderTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }
    public static void postOrderTraversal(Node node){
        if(node==null){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public static void inOrderTraversal(Node node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+ " ");
        inOrderTraversal(node.right);
    }
  public  static void iterativePreorder(Node node){
        if(node==null){
            return;
        }
      Stack<Node> st=new Stack<Node>();
        st.push(root);
      while (st.empty() == false) {

          // Pop the top item from stack and print it
          Node mynode = st.peek();
          System.out.print(mynode.data + " ");
          st.pop();

          // Push right and left children of the popped node to stack
          if (mynode.right != null) {
              st.push(mynode.right);
          }
          if (mynode.left != null) {
              st.push(mynode.left);
          }
      }
  }
  static int maxDepth(Node node){
        if(node==null){
            return 0;
        }
        int left=maxDepth(node.left);
        int right=maxDepth(node.right);
        return Math.max(left,right)+1;
  }


}
