package Leetcode.Arrays;

import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] arr2 = twosum(arr, target);
        for (int i : arr2) {
            System.out.println(i);
        }

    }
    public static int[] twosum(int[] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};

    }
}