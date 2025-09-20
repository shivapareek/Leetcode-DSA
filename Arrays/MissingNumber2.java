package Leetcode.Arrays;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int val  = missing(arr);
        System.out.println(val);

    }
    public static int missing(int[] arr){
        int sum=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        int total = n*(n+1)/2;
        return (int) total-sum;
    }
}
