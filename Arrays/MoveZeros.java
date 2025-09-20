package Leetcode.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        move(arr);
    }
    public static void move(int[] arr){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[s];
                arr[s] = temp;
                s++;
            }
        }
        for (int i: arr){
            System.out.print(i + " ");
        }
    }
}
