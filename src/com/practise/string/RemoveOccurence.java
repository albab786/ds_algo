package com.practise.string;

public class RemoveOccurence {
    public static void main(String[] args) {
//        System.out.println(remove("abad"));
        System.out.println(reverse("abcd"));
    }
    static String remove(String str){
        if(str.length()==0){
            return " ";
        }
        String smallAns=remove(str.substring(1));
        char current=str.charAt(0);
        if(current!='a'){
            return current+smallAns;
        }else{
            return smallAns;
        }
    }
    static String reverse(String str){
        if(str.length()==0){
            return " ";
        }
        String smallAns=reverse(str.substring(1));


            return smallAns+str.charAt(0);
        }
}
