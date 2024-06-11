import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        input Input = new input();
        int[] x = Input.Arr();
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(x));
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Time Complexity: O(1)");
    }
}
