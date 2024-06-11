import java.util.*;
public class mergeSorting {

    public static int[] mergeSort(int[] arr){
        if(arr.length <=1)
            return arr;
        int mid = arr.length/2;

        int[] left = Arrays.copyOfRange(arr,0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sortedLeft = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        return merge(sortedLeft, sortedRight);
    }

    public static int[] merge(int[] left, int[] right){
        int i=0,j=0,k=0;
        int[] res = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                res[k++] = left[i++];
            } else {
                res[k++] = right[j++];
            } 
        }
        while (i < left.length) {
            res[k++] = left[i++];
        }
        while (j < right.length) {
            res[k++] = right[j++];
        }
        
        return res;
    }
    public static void main(String[] args) {
        input Input = new input();
        System.out.println(Arrays.toString(mergeSort(Input.Arr())));
    }
}
