package Leetcode.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower" , "flow" , "flight"};
        String a = longest(arr);
        System.out.println(a);
    }
    public static String longest(String[] arr){
        Arrays.sort(arr);

        String a = arr[0];
        String b = arr[arr.length-1];

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        return a.substring(0,count);
    }
}
