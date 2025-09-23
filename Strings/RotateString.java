package Leetcode.Strings;

import java.util.HashMap;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String t = "cdeab";
        boolean a = rotate(s,t);
        System.out.println(a);
    }
    public static boolean rotate(String a , String b){
        if (a.length() != b.length()) return false;
     a = a+a;
     return a.contains(b);
    }
}
