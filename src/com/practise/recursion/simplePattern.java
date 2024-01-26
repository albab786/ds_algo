package com.practise.recursion;

public class simplePattern {
    public static void main(String[] args) {
        pattern(1);
    }

    static void pattern(int n) {
        if (n == 5) {
            return;
        }
        System.out.print(n +     " ");
        pattern(n + 1);

    }
}
