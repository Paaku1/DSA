package Algorithms.recursion;

public class StringLength {
    public static void main(String[] args) {
        System.out.println(strLength("Hello"));
    }

    private static int strLength(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + strLength(s.substring(1));
    }
}
