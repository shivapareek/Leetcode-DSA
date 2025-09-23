package Leetcode.Strings;

public class Atoi {
    public static void main(String[] args) {
        String s = "-42";
        int a = atoi(s);
        System.out.println(a);
    }
    public static int atoi(String s){
        if(s == null || s.length() == 0) return 0;
        int sign=1; int result =0; int i=0;
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(0) == '+') {
            i++;
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

                result = result *10 +digit;
            }
            else {
                break;
            }
        }
        return sign * result;
    }
}
