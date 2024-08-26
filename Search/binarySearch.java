package Search;

import java.util.Arrays;

public class binarySearch {
    static int find(int[] x, int t){
        Arrays.sort(x);
        return Arrays.binarySearch(x,t);
    }
    public static void main(String[] args) {
        input Input = new input();
        int t = 10;
        System.out.println("Array: "+Arrays.toString(Input.arr()));
        System.out.println("Target Value: "+t);
        int r = find(Input.arr(),t);
        int res = (r > 0) ? r : -1;
        System.out.println("Found "+res);
    }
}