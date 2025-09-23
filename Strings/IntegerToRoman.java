package Leetcode.Strings;

public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 3749;
        String a = roman(n);
        System.out.println(a);

    }
    public static String roman(int n){
        int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] r = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        String s = new String();
        while(n>0){
            if(n>=a[i]){
                s += r[i];
                n -= a[i];

            }
            else {
                i++;
            }
        }
        return s;
    }
}
