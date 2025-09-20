package Leetcode.Arrays;

import java.util.*;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(majority(arr));
    }
    public static List<Integer> majority(int[] arr){
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if(count1 == 0 && arr[i]!= candidate2){
                count1 = 1;
                candidate1 = arr[i];
            }
            else if( count2 == 0 && arr[i] != candidate1){
                count2  = 1;
                candidate2 = arr[i];
            }
            else if(arr[i] == candidate1){
                count1++;
            }
            else if (arr[i] == candidate2){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int num:arr){
            if(num == candidate1) count1++;
            if(num == candidate2) count2++;
        }

        if(count1 > n/3) res.add(candidate1);
        if(count2 > n/3) res.add(candidate2);

        return res;

    }

}
