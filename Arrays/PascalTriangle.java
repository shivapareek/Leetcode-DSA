package Leetcode.Arrays;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int  num = 5;
        System.out.println(pascal(num));
    }
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){
                    row.add(1);
                }
                else {
                    int total = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    row.add(total);
                }

            }
            res.add(row);
        }
        return res;
    }
}
