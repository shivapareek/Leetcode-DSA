package Leetcode.Arrays;

public class CheckifArrayisSortedorRotated {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        System.out.println(check(arr));

    }
    public static boolean check(int[] arr){
        int count =0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
     return count<=1;
    }
}
