package Leetcode.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,1,5};
        Next(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void Next(int[] arr){
        int n = arr.length;
        int pivot = -1;
        int min = Integer.MAX_VALUE;

        for (int i = n-2; i >=0 ; i--) {
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }

        }
        if(pivot == -1){
            reverse(arr,0,n-1);
            return;
        }
        for (int j = n-1; j > pivot; j--) {
            if (arr[j] > arr[pivot]){
                swap(arr, pivot, j);
                break;
            }
        }

        reverse(arr,pivot+1,n-1);
    }
    public static void swap(int[] arr, int max ,int next){
        int temp =  arr[max];
        arr[max] = arr[next];
        arr[next] = temp;
    }
    public static void reverse(int[] arr, int start ,int end) {
        while (start <= end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
