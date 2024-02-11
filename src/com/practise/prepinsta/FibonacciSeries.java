package com.practise.prepinsta;

import java.util.ArrayList;

public class FibonacciSeries {
    static ArrayList<?> fibonaciSeries(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int n1=0;
        int n2=1;
        list.add(n1);
        list.add(n2);
        for (int i=2;i<=n;i++){
            int n3=n1+n2;
            list.add(n3);
            n1=n2;
            n2=n3;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(fibonaciSeries(10));
    }
}
