package Leetcode.Arrays;

public class MaximumConsecutiveOnes{
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int val  = maximum(arr);
        System.out.println(val);

    }
    public static int maximum(int[] arr){
        int count=0;
        int max = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
           if(arr[i] !=0){
               count++;
               if(count>max){
                   max = count;
               }

           }
           else{
               count = 0;
           }
        }
        return max;
    }
}
