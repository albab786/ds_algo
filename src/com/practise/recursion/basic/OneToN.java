package com.practise.recursion.basic;

public class OneToN {
    public static void main(String[] args) {
//        oneToN(5);
      NToOne(5);
    }
    public static void  NToOne(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        NToOne(n-1);
    }
    public static void oneToN(int n){
        if(n==0){
            return;
        }
        oneToN(n-1);
        System.out.print(n + " ");
    }
}
