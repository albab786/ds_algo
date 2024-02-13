package com.practise.prepinsta;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    static void countFreq(int arr[], int n)
    {
        Map<Integer, Integer> mp = new HashMap<>();
        int count_dis=0;
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }

        System.out.println(mp.size());
    }
    // Driver code
    public static void main(String []args)
    {
        int arr[] = new int[]{10, 40, 50, 20, 10, 20, 30, 10};
        int n = arr.length;
        countFreq(arr, n);
    }
}
