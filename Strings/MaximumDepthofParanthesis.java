package Leetcode.Strings;

public class MaximumDepthofParanthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int a = paranthesis(s);
        System.out.println(a);
    }
    public static int paranthesis(String s){
            int count=0;
            int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                count++;
                if(max<count){
                    max = count;
                }
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }
        return max;
    }
}
