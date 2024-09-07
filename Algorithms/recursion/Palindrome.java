package Algorithms.recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s = "mmmm";
        System.out.println(isPalindrome(s,0,s.length()-1));
        System.out.println(isPalindrome(s,0));
    }

    private static boolean isPalindrome(String s, int i) {
        if(i>s.length()/2) return true;
        return (s.charAt(i) == s.charAt(s.length()-1-i)) && isPalindrome(s,i+1);
    }

    private static boolean isPalindrome(String s,int i,int j) {
        if(i==j) return true;
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        if(i<j) {
            return isPalindrome(s,i+1,j-1);
        }
        return true;
    }
}
