package com.practise.basicMaths;

public class HCF {

    public static void main(String[] args) {
        System.out.println(gcd(11,22));
        System.out.println(lcm(2,20));
    }

    public static int gcd(int a,int b){
        while ( b!=0){

                int temp = b;
                b = a % b;
                a = temp;

        }
        return a;
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }






}
