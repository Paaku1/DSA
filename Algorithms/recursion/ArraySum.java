package Algorithms.recursion;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int s = 0;
        System.out.println(sum(arr, 0, s));
    }

    private static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }

}
