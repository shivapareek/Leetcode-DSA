package Leetcode.Strings;

public class ReverseWordInaString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String a = reverse(s);
        System.out.println(a);
    }
    public static String reverse(String s){

        String[] ch = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = ch.length -1 ; i >= 0  ; i--) {
            sb.append(ch[i]);
            if(i!=0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}
