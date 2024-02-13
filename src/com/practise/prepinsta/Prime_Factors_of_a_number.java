package com.practise.prepinsta;

import java.util.LinkedList;

public class Prime_Factors_of_a_number {
    public static int isprime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }

        return 1;
    }

    public static LinkedList<?> primeFactors(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (isprime(i) == 1) {
                int x = n;
                while (x % i == 0) {
                    list.add(i);

                    x /= i;
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(primeFactors(15));
    }
}
