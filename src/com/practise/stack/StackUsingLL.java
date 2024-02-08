package com.practise.stack;

public class StackUsingLL {
    public static class  Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        public void push(int val){
            Node node=new Node(val);
            node.next=head;
            head=node;
            size++;
        }
        public int pop(){
            if(head==null){
                return -1;
            }
            int val=head.val;
            head=head.next;
            size--;
            return val;


        }
        public int peek(){
            return head.val;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        boolean isEmpty() {
            if (size == 0) {
                return true;

            }
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(80);
        st.push(90);
        st.push(75);
        st.push(65);
        st.push(55);
        st.display();
    }
}
