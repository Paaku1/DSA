import java.util.Arrays;

public class insertionSort {
    public static int[] sort(int[] x){
        int n = x.length;
        for(int i=1 ; i<n ; i++){
            int idx = i;
            int val = x[i];
            int j = i-1;
            while(j>=0 && x[j] > val){
                x[j+1] = x[j];
                idx = j;
                j--;
            }
            x[idx] = val;
        }
        return x;
    }
    public static void main(String[] args) {
        input Input = new input();
        System.out.println("Array: "+Arrays.toString(Input.Arr()));
        System.out.println("Insertion Sort: "+Arrays.toString(sort(Input.Arr())));
    }
}
