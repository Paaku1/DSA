package Algorithms.recursion;

public class reverseString {
    public static void main(String[] args) {
        String s = "hello";
        String res = "";
        System.out.println(reverse(s,res));
    }

    private static String reverse(String s,String res) {
        if(s.length()==0){
            return res;
        }
        res += s.charAt(s.length()-1);
        return reverse(s.substring(0,s.length()-1), res);
    }
}
