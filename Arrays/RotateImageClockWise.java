package Leetcode.Arrays;

public class RotateImageClockWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] rotate(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
        int start = 0 , end = arr.length -1;
            while (start< end){
            int temp = arr[start][i];
            arr[start][i] = arr[end][i];
            arr[end][i] = temp;
            start++;
            end--;
           }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
}
