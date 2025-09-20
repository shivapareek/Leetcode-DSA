package Leetcode.Arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-0, 0, 0, 0};
        threesum(arr);
    }
    public static void threesum(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int j=i+1; int k = arr.length -1;

            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
                while(j<k){
                    int val = arr[i] + arr[j] + arr[k];
                    if(val>0){
                        k--;
                    }
                    else if (val<0) {
                        j++;
                    }
                    else{
                        res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                        j++;
                        while (j<k && arr[j] == arr[j-1]){
                            j++;
                        }
                    }
                }
        }
        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }

    }
}
