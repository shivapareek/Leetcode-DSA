package Leetcode.Strings;

public class sumofbeautyofallstring {
    public static void main(String[] args) {
        String s = "aabcb";
        int a = beauty(s);
        System.out.println(a);
    }

    public static int beauty(String s){
        int b =0;
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                freq[c-'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for(int f: freq){
                    if(f>0){
                        max = Math.max(max,f);
                        min = Math.min(min,f);
                    }
                }
                sum += (max-min);

            }
        }
        return sum;
    }
}
