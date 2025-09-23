package Leetcode.Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean a = anagram(s,t);
        System.out.println(a);
    }
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length()) return false;

        char[] ch = new char[128];

        for(char c: s.toCharArray()){
            ch[c]++;
        }
        for (char d: t.toCharArray()){
            ch[d]--;
        }
        for(char num: ch){
            if(num>0){
                return false;
            }
        }
        return true;
    }
}
