package Leetcode.Arrays;

public class MergetwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] arr1 , int m , int[] arr2 , int n){
        int i = m-1, j = n-1 , indx = m+n-1;

        while(i>= 0 && j>=0){
            if(arr1[i] >= arr2[j] ){
                arr1[indx] = arr1[i];
                indx--;
                i--;
            }
            else{
                arr1[indx] = arr2[j];
                indx--;
                j--;
            }
        }
        while (j>=0){
            arr1[indx] = arr2[j];
            indx--;
            j--;
        }

        for (int num:arr1){
            System.out.print( num + " ");
        }
    }
}
