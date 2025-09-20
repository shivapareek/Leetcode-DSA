package Leetcode.Arrays;
import java.util.*;

public class LongestZeroSumSubarray {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(longestZeroSum(arr));
    }

    public static int longestZeroSum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // case 1: sum == 0 from start
            if (sum == 0) {
                maxLen = i + 1;
            }

            // case 2: sum seen before
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i); // store first occurrence only
            }
        }
        return maxLen;
    }
}
