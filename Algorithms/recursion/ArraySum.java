package Algorithms.recursion;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArraySum Arrays = new ArraySum();
        System.out.println(Arrays.sum(arr, 0, 0));
    }

    private int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }

}
