package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        leader(arr);
    }
    public static void leader(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int leader = arr[arr.length-1];
        res.add(leader);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i] > leader){
                leader = arr[i];
                res.add(arr[i]);
            }
        }
        Collections.reverse(res);
        for(int i: res){
            System.out.print(i+ " ");
        }
    }
}
