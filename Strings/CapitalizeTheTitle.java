package Leetcode.Strings;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String s = "capitalize tHE tiTLE";
        String a = capitalize(s);
        System.out.println(a);
    }
    public  static  String capitalize(String s){
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() <= 2){
                arr[i] = arr[i].toLowerCase();
            }
            else {
                String pre = arr[i].substring(0,1).toUpperCase();
                String post = arr[i].substring(1).toLowerCase();
                arr[i] = pre+post;
            }
        }
        return String.join(" ",arr);
    }
}
