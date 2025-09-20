package Leetcode.Arrays;

public class ReverseInteger {
    public static void main(String[] args) {
        reverse(121);

    }
    public static void reverse(int n){
        int rev = 0;
        while(n!=0){
            int temp = n%10;
            rev = rev*10 + temp;
            n = n/10;
        }
        System.out.println(rev);
    }
}
