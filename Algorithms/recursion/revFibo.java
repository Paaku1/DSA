package Algorithms.recursion;

public class revFibo {
    public static void main(String[] args) {
        int n = 10;
        reverse(n, 0, 1);
    }

    private static void reverse(int n, int i, int j) {
        if (n > 0) {
            reverse(n - 1, j, i + j);
            System.out.print(i + " ");
        }
    }
}
