package Leetcode.Strings;

public class LongestOddNumberInString {
    public static void main(String[] args) {
        String s = "35427";
        String a = longest(s);
        System.out.println(a);
    }
    public static String longest(String s){
        for (int i = s.length() - 1; i >= 0  ; i--) {
            if(s.charAt(i) % 2 != 0){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
