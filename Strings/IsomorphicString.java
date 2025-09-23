package Leetcode.Strings;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        boolean a = isomorphic(s,t);
        System.out.println(a);
    }
    public static boolean isomorphic(String a , String b){
        if(a.length() != b.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if(map.containsKey(c1) && map.get(c1)!= c2){
                return false;
            }
            if(map2.containsKey(c2) && map2.get(c2)!= c1){
                return false;
            }

            map.put(c1,c2);
            map2.put(c2,c1);


        }
        return true;
    }
}
