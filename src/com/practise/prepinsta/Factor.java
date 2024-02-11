package com.practise.prepinsta;


import java.util.LinkedList;

public class Factor {
    static LinkedList<?> factors(int n){
        LinkedList<Integer> list=new LinkedList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If both pair of factors are equal then we just print
                // once, example for 100 : (a, b) : (10, 10)
                // 10 should be printed just once
                if (i == n / i) {
                    list.add(i);
                }

                // else print both the pairs
                else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(factors(25));
    }
}
