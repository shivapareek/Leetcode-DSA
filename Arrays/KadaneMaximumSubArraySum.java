package Leetcode.Arrays;

public class KadaneMaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
       int val = maximum(arr);
        System.out.println(val);


    }
    public static int maximum(int[] arr){
            int sum =0;
            int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

                if(maxsum<sum){
                    maxsum = sum;
                }

                if(sum<0){
                    sum=0;
                }
        }
        return maxsum;
    }
}
