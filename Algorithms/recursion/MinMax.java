package Algorithms.recursion;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int min = findMin(arr, arr.length);
        int max = findMax(arr, arr.length);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static int findMax(int[] arr, int i) {
        if(i==1){
            return arr[0];
        }
        return Math.max(arr[i-1], findMax(arr,i-1));
    }

    private static int findMin(int[] arr, int i) {
        if(i==1){
            return arr[0];
        }
        return Math.min(arr[i-1], findMin(arr,i-1));
    }

}