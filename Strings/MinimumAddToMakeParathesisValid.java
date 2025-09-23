package Leetcode.Strings;

public class MinimumAddToMakeParathesisValid {
    public static void main(String[] args) {
        String s = "()))((";
        int a = parenthesis(s);
        System.out.println(a);
    }
    public static int parenthesis(String s){
        int open=0;int extra =0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                open++;
            }
            else {
                if (open>0){
                    open--;
                }
                else {
                    extra++;
                }
            }
        }
        return open+extra;
    }
}
