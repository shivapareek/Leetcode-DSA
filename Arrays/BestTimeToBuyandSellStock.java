package Leetcode.Arrays;

public class BestTimeToBuyandSellStock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int val = stock(arr);
        System.out.println(val);
    }
    public static int stock(int[] arr){
        int min =Integer.MAX_VALUE;
        int maxProfit=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            else{
                int profit = arr[i] - min;
                if(maxProfit < profit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;

    }
}
