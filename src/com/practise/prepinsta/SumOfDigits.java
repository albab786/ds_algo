package com.practise.prepinsta;

public class SumOfDigits {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }

    static int sumOfDigits2(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits2(n / 10);
    }

    static int sumOfDigits3(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return (n % 10) + sumOfDigits3(n / 10, sum);
    }

    public static void main(String[] args) {
        int n = 1234;

        System.out.println(sumOfDigits3(n, 0));
        String numberStr = "123";

        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed Integer: " + number);
        String s="45678";
        int no=Integer.parseInt(s);
        System.out.println(no);

    }
}
