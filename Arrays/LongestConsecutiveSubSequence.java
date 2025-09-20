package Leetcode.Arrays;

import java.util.HashSet;

public class LongestConsecutiveSubSequence {
    public static void main(String[] args) {
        int[] arr = {100,200,1,2,3,4};
        System.out.println(longest(arr));
    }
    public static int longest(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int longestNum = 0;

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i] -1)) {
                int current = arr[i];
                int currentlen = 1;

                while (set.contains(current + 1)) {
                    current++;
                    currentlen++;
                }
                longestNum = Math.max(longestNum,currentlen);
            }
        }
        return longestNum;
    }
}
