package com.practise.LL;

public class CL {
    private Node head;
    private Node tail;

    public CL(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
    tail.next = node;
    node.next = head;
    tail = node;

}
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }   
    private class Node{
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node(int val){
            this.val=val;
        }
    }
}
