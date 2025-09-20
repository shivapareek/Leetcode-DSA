package Leetcode.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int val = majority(arr);
        System.out.println(val);
    }
    public static int majority(int[] arr){
        int n = arr.length;
        int candidate = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(count == 0){
                candidate = arr[i];
            }
            if(candidate == arr[i]){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}
