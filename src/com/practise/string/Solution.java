package com.practise.string;

class Solution {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
    }

    public static int maxRepeating1(String sequence, String word) {

//        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < sequence.length() - 1; i++) {
            String ans = "";
            for (int j = 1; j < sequence.length(); j++) {

                ans += sequence.charAt(i + j);

                if (ans.equals(word)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int maxRepeating(String sequence, String word) {
        int count = 0;

        for (int i = 0; i < sequence.length() - word.length() + 1; i++) {
            String ans = "";
            for (int j = 0; j < word.length(); j++) {
                ans += sequence.charAt(i + j);
            }

            if (ans.equals(word)) {
                count++;
            }
        }

        return count;
//public static int maxRepeating(String sequence, String word) {
//    int count = 0;
//    int maxCount = 0;
//
//    for (int i = 0; i <= sequence.length() - word.length(); i++) {
//        count = 0;
//        for (int j = 0; j < word.length(); j++) {
//            if (sequence.charAt(i + j) == word.charAt(j)) {
//                count++;
//            } else {
//                break;
//            }
//        }
//        maxCount = Math.max(maxCount, count);
//    }
//
//    return maxCount / word.length(); // The result is the maximum consecutive repetitions.
//}
    }
}