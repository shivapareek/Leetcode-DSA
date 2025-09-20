package Leetcode.Arrays;

public class Pallindrome {
    public static void main(String[] args) {
        boolean val = pallindrome(120);
        System.out.println(val);

    }
    public static boolean pallindrome(int n){
        int rev = 0;
        int orignal =  n;
        while(n!=0){
            int temp = n%10;
            rev = rev*10 + temp;
            n = n/10;
        }
       if(orignal == rev){
           return true;
       }
       return false;
    }
}
