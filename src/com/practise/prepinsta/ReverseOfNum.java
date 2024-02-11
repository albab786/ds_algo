package com.practise.prepinsta;

public class ReverseOfNum {
    static int reverse(int n){
        int rev=0;
        int rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    static int getReverse (int num, int rev)
    {
        if (num == 0)
            return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse (num / 10, rev);
    }
    public static void main(String[] args) {
        System.out.println(getReverse(5556,0));

    }
}
