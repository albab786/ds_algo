package com.practise.array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int sum = 0;
        int tens = digits.length - 1;
        for (int i = 0; i < digits.length; i++) {
            sum = (int) (sum + Math.pow(10, tens) * digits[i]);

            tens--;

        }

        sum++;
        int count = 0;
        int digi = sum;
        while (digi != 0) {
            digi = digi / 10;
            count++;
        }
        int ans[] = new int[count];
        int len = count;
        while (sum != 0) {
            int digit = sum % 10;
            ans[len - 1] = digit;
            len--;
            sum = sum / 10;


        }
        return ans;

    }

    public static void main(String[] args) {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(Arrays.toString(plusOne(digits)));

    }
}
