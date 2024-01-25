package com.practise.basicMaths;

public class SQRT {


    public static void main(String[] args) {
        System.out.println(sqrtnum(144));
    }
    static double sqrtnum(double n){
        double c=1;
        double num=n/2;
        while (num!=0){
            if(c*c==n){
                return c;
            }
            c++;
        }
        return 0;
    }
}
