package Leetcode.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int val  = missing(arr);
        System.out.println(val);

    }
    public static int missing(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int end = n-1;
            if(arr[0] != 0){
                return 0;
            }
            if (arr[end] != n ) {
                return n;
            }
            for (int j = 0; j < n; j++) {
                if(arr[j] !=j){
                    return j;
                }
            }
        return 0;
    }
}
