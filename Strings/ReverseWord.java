package Leetcode.Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String s ="Let's take Leetcode Contest";
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        String[] ch = s.split(" ");

        for (int i = 0; i < ch.length; i++) {
            for (int j = ch[i].length()-1; j >=0 ; j--) {
                sb.append(ch[i].charAt(j));
            }
            if (i != ch.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
