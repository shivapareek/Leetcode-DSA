package Leetcode.Arrays;

import java.util.Arrays;

public class MedianofTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        median(arr1,arr2);
    }
    public static void median(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] arr =  new int[m+n];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }for (int i = 0; i < arr2.length; i++) {
            arr[n+i] = arr2[i];
        }
        Arrays.sort(arr);
        int len = arr.length;
        if(len % 2 == 0){
            System.out.println((arr[len/2] + arr[(len/2)-1])/2.0);
        }
        else{
            System.out.println(arr[len/2]);
        }

    }
}
