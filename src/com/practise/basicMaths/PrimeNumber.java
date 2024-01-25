package com.practise.basicMaths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
//    public static boolean isPrime(int n){
//        int c=2;
//        if (n <= 1) {
//            return false;
//        }
//        while(c * c <=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return true;
static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }

    int c = 2;
    while (c * c <= n) {
        if (n % c == 0) {
            return false;
        }
        c++;
    }
    return true;
    }

}
