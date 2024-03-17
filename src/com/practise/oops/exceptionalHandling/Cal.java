package com.practise.oops.exceptionalHandling;

public class Cal {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

//        try{
//       try{
//           int c=a/b;
//       }catch(Exception e){
//           System.out.println(e.getMessage());
//           System.out.println("Dont divide by zer");


        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("caught");
        }
    }
        static void divide ( int a, int b) throws ArithmeticException {
            if (b == 0) {
                throw new ArithmeticException("Dont divide by zero");
            }
            System.out.println(a / b);
        }


}



