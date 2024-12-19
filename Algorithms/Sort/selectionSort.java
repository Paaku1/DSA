package Algorithms.Sort;
import java.util.Arrays;

public class selectionSort{
    static int[] sort(int[] x){
        for(int i=0;i<x.length;i++){
            int min = i;
            for(int j=i+1;j<x.length;j++)
                if(x[j] < x[min])
                    min = j;
                int temp = x[min];
                x[min] = x[i];
                x[i] = temp;
        }
        return x;
    }
    public static void main(String[] args) {
        input Input = new input();
        int[] arr = Input.Arr();
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Selection Sort: "+Arrays.toString(sort(arr)));
    }
}