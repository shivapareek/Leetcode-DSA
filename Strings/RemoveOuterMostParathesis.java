package Leetcode.Strings;

public class RemoveOuterMostParathesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String res = remove(s);
        System.out.print(res);

    }
    public static String remove(String s){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                count++;
            }
            if(count!=0){
                sb.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                count--;
            }
        }
        return sb.toString();
    }
}
