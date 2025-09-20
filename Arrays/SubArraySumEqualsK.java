package Leetcode.Arrays;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 2;
        int val = subsum(arr,k);
        System.out.println(val);
    }
    public static int subsum(int[] arr,int k){
            int count =0;
            int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n ; j++) {
                sum += arr[i];

                if(sum==k){
                    count++;
                }

            }
        }
        return count;
    }
}
