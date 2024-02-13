package com.practise.queue;

public class Queue {
    public static class Arrayqueue{
        int arr[]=new int[50];
        int size=0;
        int f,r=-1;
        void add(int data){
            if(f==-1 && r==-1){
                f=0;
                r=0;
                arr[r]=data;
                size++;
            }
            if(size<arr.length){
                r++;
                arr[r]=data;
                size++;
            } else if (size==arr.length) {

                System.out.println("size is full");
            }
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }

            int x=arr[f];
            f++;
            size--;
            return x;
        }
        int peek(){

            return arr[f];
        }
        void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Arrayqueue q=new Arrayqueue();
        q.add(5);
        q.add(4);
        q.add(9);
        q.add(7);
        q.display();
    }
}
