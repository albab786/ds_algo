package com.practise.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));

    }
    public static boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;
        while ((s<=e)){
            if(str.charAt(s)  ==(str.charAt(e))){
                s++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }
}
