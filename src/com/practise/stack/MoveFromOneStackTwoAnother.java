package com.practise.stack;

import java.util.Stack;

public class MoveFromOneStackTwoAnother {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(5);
        st.push(25);
        st.push(125);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());

        }
        System.out.println(gt);
        Stack<Integer> ansStack=new Stack<>();
        while (gt.size()>0){
            ansStack.push(gt.pop());
        }
        System.out.println(ansStack);
    }
}
