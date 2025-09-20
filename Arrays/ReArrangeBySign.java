package Leetcode.Arrays;

public class ReArrangeBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
         rearrange(arr);

    }
    public static void rearrange(int[] arr){
        int pos=0;int neg = 1;
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                arr2[pos] = arr[i];
                pos+=2;
            }
            else{
                arr2[neg] = arr[i];
                neg+=2;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
