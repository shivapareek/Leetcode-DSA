package Leetcode.Arrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
       int[] arr = intersection(arr1,arr2);
       for(int j:arr){
           System.out.println(j);
       }
    }
    public static int[] intersection(int[] arr1, int[] arr2){
        HashSet<Integer> res1 =  new HashSet<>();
        HashSet<Integer> res2 =  new HashSet<>();

        for(int i:arr1){
            res1.add(i);
        }

        for(int j: arr2){
            if(res1.contains(j)){
                res2.add(j);
            }
        }
        int[] result = new int[res2.size()];
        int i=0;
        for(int num: res2){
            result[i] = num;
            i++;
        }

        return result;
    }
}
