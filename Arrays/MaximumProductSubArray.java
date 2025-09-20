package Leetcode.Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int val = maxproduct(arr);
        System.out.println(val);
    }
    public static int maxproduct(int[] arr){
        int suff=1 , pre = 1;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if(pre == 0) pre =1;
            if(suff == 0) suff =1;

            pre *= arr[i];
            suff *= arr[n-i-1];

            max = Math.max(max,Math.max(pre,suff));

        }
        return max;
    }
}
