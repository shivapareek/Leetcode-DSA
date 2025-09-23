package Leetcode.Strings;

public class IndexofFirstOccurance {
    public static void main(String[] args) {
        String s = "sadbutsad";
        String t = "sad";
        int a = occurance(s,t);
        System.out.println(a);
    }
    public static int occurance(String s, String t){
        int m = s.length();
        int n = t.length();
        for (int i = 0; i <= m-n; i++) {
                if(s.substring(i,i+n).equals(t)){
                    return i;
            }
        }
        return -1;
    }
}
