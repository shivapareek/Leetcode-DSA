package Leetcode.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        String b = sortchar(s);
        System.out.println(b);
    }
    public static String sortchar(String s){
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> arr = new ArrayList<>(map.entrySet());
        arr.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> c: arr){
            for (int i = 0; i < c.getValue(); i++) {
                sb.append(c.getKey());
            }
        }
        return sb.toString();
    }
}
