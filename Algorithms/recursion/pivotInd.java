package Algorithms.recursion;

public class pivotInd {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int r = 0, l = 0;
            r = i == 0 ? 0 : sum(nums, 0, i, r);
            l = i == nums.length - 1 ? 0 : sum(nums, i + 1, nums.length, l);
            if (r == l)
                return i;
        }
        return -1;
    }

    private int sum(int[] a, int i, int j, int sum) {
        if (i == j) {
            return sum;
        }
        return sum(a, i + 1, j, sum + a[i]);
    }

    public static void main(String[] args) {
        pivotInd p = new pivotInd();
        int[] nums = { -1, -1, 0, 1, 1, 0 };
        System.out.println(p.pivotIndex(nums));
    }
}
