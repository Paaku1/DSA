package Algorithms.Search;

import java.util.Arrays;

public class linearSearch {
    static int find(int[] x, int t){
        for(int i=0; i<x.length; i++){
            if(x[i] == t){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        input Input = new input();
        int t = 9;
        System.out.println("Array: "+Arrays.toString(Input.arr()));
        System.out.println("Target Value: "+ t);
        System.out.println("Found on Index: "+find(Input.arr(),t));
    }
}
