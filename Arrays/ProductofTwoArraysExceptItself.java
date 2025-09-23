package Leetcode.Arrays;

public class ProductofTwoArraysExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ab = product(arr);
        for (int i = 0; i < ab.length; i++) {
            System.out.println(ab[i]);
        }
    }
    public static int[] product(int[] arr){
        int prefix=1,postfix=1;
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            result[i] *= postfix;
            postfix *= arr[i];
        }

        return result;
    }
}
