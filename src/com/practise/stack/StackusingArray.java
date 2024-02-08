package com.practise.stack;




public class StackusingArray {
    public static class  Stack {
        int arr[]=new int[10];
        int idx=0;
        void push(int data){

            arr[idx]=data;
            idx++;

        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return  -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return  -1;
            }
            int top=arr[idx-1];
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(80);
        st.push(90);
        st.push(75);
        st.display();
    }
}
