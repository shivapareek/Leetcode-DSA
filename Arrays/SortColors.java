package Leetcode.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1,0,0};
        sort(arr);
    }
    public static void sort(int[] arr){

        int low = 0; int mid = 0; ; int high = arr.length-1;
        while(mid<=high) {
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

        for (int i:arr){
            System.out.print(i + " ");
        }

    }

    public static void swap(int[] arr,int start,int end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }
}
