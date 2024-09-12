package Algorithms.recursion;

public class removeDuplicateChar {
    public static void main(String[] args) {
        String str = "geeksforgeek";
        System.out.println(removeDuplicates(str));

    }

    private static String removeDuplicates(String str) {
        StringBuilder s = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            boolean rep = false;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                rep = true;
                i++;
            }
            if (!rep) {
                s.append(str.charAt(i));
            }
        }
        if (n == s.length())
            return s.toString();
        return removeDuplicates(s.toString());
    }
}
