package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(arr));


    }
    public static List<Integer> spiral(int[][] arr){
        int top=0,bottom = arr.length -1;
        int left = 0 , right = arr[0].length -1;

        List<Integer> res = new ArrayList<>();

        while(top<=bottom && left<=right){
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                res.add(arr[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right ; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left<=right){
                for (int i = bottom; i >=top ; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
