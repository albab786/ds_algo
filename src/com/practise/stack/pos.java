package com.practise.stack;
import java.util.Stack;
public class pos {



        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(5);
            st.push(25);
            st.push(125);
            st.push(225);
            st.push(525);
            System.out.println(st);
            add(st, 2, 52);
            System.out.println(st);
        }

        public static void add(Stack<Integer> st, int pos, int ins) {
            Stack<Integer> gt = new Stack<>();

            // Move elements to temporary stack until reaching the desired position
            while (st.size() > pos) {
                gt.push(st.pop());
            }

            // Add the new element at the desired position
            st.push(ins);

            // Push back the elements from the temporary stack
            while (!gt.isEmpty()) {
                st.push(gt.pop());
            }
        }
    }


